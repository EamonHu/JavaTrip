>  1.上次聊到HashMap在多线程环境下存在线程安全问题，一般怎么处理这种情况呢？

这时候一般使用线程安全的集合HashTable和ConcurrentHashMap。

> 2.讲讲HashTable和HashMap的区别？

- HashMap相比HashTable是线程安全的，适合在多线程的情况下使用，但是效率不太乐观。因为HashTable在对所有的数据操作都会加上锁，所以效率低下。

- 另外HashTable不允许键或者值为null，HashMap的键值都可以为null。因为HashTable用的是**安全失败机制(Fail-safe)**。
- 初始化容量不同。HashMap初始容量是16，HashTable是11，两者负载因子默认都是0.75
- 迭代器不同：HashMap中Iterator迭代器是fail-fast的，而HashTable的Enumerator不是fail-fast的。

> 3.fail-fast fail-safe是什么

fail-fast是Java集合中的一种机制，如果遍历过程中对集合对象内容进行了修改（增加、删除、修改），则会抛出Concurrent Modification Exception.  
原理是因为在遍历期间会使用一个modCount变量，在迭代器遍历下一个元素时，会将modCount和期望值比较，如果不等。就会抛出异常，终止遍历

java.util下的集合类都是快速失败的；java.util.concurrent包下的容器都是安全失败，可以在多线程下并发使用，并发修改。

原理是因为采用安全机制的集合容器，在遍历时不是直接在集合内容上访问的，而是先复制原有的集合内容，在拷贝的集合上进行遍历。所以不会抛出ConcurrentModificationException异常

> 4.聊一聊ConcurrentHashMap的数据结构，为什么它的并发度高？

jdk1.7中，ConcurrentHashMap和HashMap一样都是数组+链表组成的。
![image](https://note.youdao.com/yws/res/20781/FADCCA758D5D4FF3BFFF8CCEFB0B44FE)

segment是ConcurrentHashMap的一个内部类，主要组成如下：
![image](https://note.youdao.com/yws/res/20782/DA24C3A6A30F4337B1606D5581D451F1)
HashEntry跟HashMap差不多的，但是不同点是，他使用volatile去修饰了他的数据Value还有下一个节点next。

> 5.Volatile的特性是什么？

1. 可见性：保证了不同线程对这个遍历操作时的可见性。即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
2. 有序性：禁止指令重排
3. 原子性：Volatile只能保证对单次读/写的原子性，不能保证i++的原子性。

> 6.ConcurrentHashMap并发度高的原因？

原理上来说，是因为ConcurrentHashMap采用了**分段锁**技术，其中Segment继承与ReentrantLock。

不会像HashTable那样不管是put和get操作都做同步处理，理论上ConcurrentHashMap支持CurrencyLevel（Segment数组数量）的线程并发。

每当一个线程独占一个Segment时，不会影响到其它Segment。

**jdk1.7的put和get**  
put时首先会尝试获取锁，如果获取失败肯定存在其它线程竞争。1.自旋获取锁 2.重试次数达到最大重试次数后，改为阻塞锁获取。  
get时，通过key的hash定位到具体的Segment，再通过一次Hash定位到具体的元素上。HashEntry中的Value都是由volatile关键词修饰的，保证了内存可见性，所以每次获取时都是最新值。**get整个过程不需要进加锁**

> 7.ConcurrentHashMap在jdk1.7和1.8有什么区别吗？

因为还是使用数组加链表的方式，在我们去查询的时候，还得遍历链表，导致效率很低。这个和jdk1.7的HashMap是一样的问题，所以在jdk1.8中同样采用数组+链表+红黑树进行优化。

其中1.8中抛弃了原来的Segment分段锁，采用了**CAS+Synchronized**来保证并发安全性。

跟HashMap很像，把HashEntry改成了Node，但是作用不变。把值和next采用了volatile修饰，保证了可见性。

> 8.JDK1.8的存取操作流程？以及如何保证线程安全的？

**jdk1.8的put**
1. 根据key值计算出hashCode
2. 判断是否需要初始化
3. 为当前的key定位出Node,如果为空可以写入数据，利用CAS尝试写入，失败则自旋保证成功。
4. 判断当前是否需要扩容
5. 如果都不满足，则利用Synchronized锁写入数据
6. 如果数量大于8，转为红黑树结构


**jdk1.8的get**
- 根据key计算出hashcode寻址，如果在桶上那么直接返回值。
- 如果是红黑树那就按照树的方式获取值
- 如果不满足就按照链表的方式遍历获取值



> 9.上面提到的CAS是什么？自旋是什么？

CAS（Compare and Swap）是乐观锁的一种实现方式，是一种轻量级锁，JUC很多工具类的实现就是基于CAS。

线程在读取数据的时候不进行加锁，当准备写回数据的时候，会比较原值和当前值，观察原值是否有被其它线程修改，如果已被修改，则重新执行读取流程。

这种一种乐观策略，认为并发操作并不总会发生。

> 10.CAS就一定能保证数据没被别的线程修改过吗？

不能，比如经常的ABA问题，CAS就无法判断了。

> 11.什么是ABA

就是说一个线程把原值A改成了B，又来了一个线程把值又改回了A，对于这个时候判断线程，发现值还是A，它可能会误认为没有被人改过。这就是ABA问题

> 12.怎么解决ABA问题

在一些只追求结果的场景，ABA发生了不影响业务。但是某些情况下，比如银行的资金变动，需要记录每一笔的动向。
- 加版本号，查询值的时候带一个版本号，判断时候连值和版本号一起判断。成功后给版本号加1
- 加时间戳

> 13.CAS性能很高，但是为什么jdk1.8之后还是会用Synchronized？

Synchronized之前一直是重量级锁，但是后来Sun公司对其进行了升级。

针对Synchronized获取锁的方式，JVM使用了锁升级的优化方式，就是先试用**偏向锁**优先使用同一线程然后再次获取锁，如果失败，就升级为**CAS轻量级锁**，如果失败会短暂**自旋**，防止线程被系统挂起。最后如果以上都失败就升级为**重量级锁**。

所以是一步步升级上去的，最初也是通过轻量级的方式锁定的。