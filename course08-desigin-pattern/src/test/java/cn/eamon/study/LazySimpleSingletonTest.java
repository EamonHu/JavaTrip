package cn.eamon.study;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/13 0:15
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        System.out.println("执行结束");
    }
}
