package cn.eamon.study.gp18_iterator.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 16:33
 */
public class Client {
    public static void main(String[] args) {
        // 来一个容器对象
        IAggregate<String> aggregate = new ConcreteAggregate<>();
        // 添加元素
        aggregate.add("hello");
        aggregate.add("coder");
        aggregate.add("eamon");
        // 获取容器对象迭代器
        Iterator<String> iterator = aggregate.iterator();
        // 遍历
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
