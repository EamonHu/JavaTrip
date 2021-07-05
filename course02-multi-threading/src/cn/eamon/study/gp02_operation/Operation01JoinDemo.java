package cn.eamon.study.gp02_operation;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/5 15:52
 */
public class Operation01JoinDemo {
    private static int x = 1;
    private static int y = 2;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            x = 2;
            y = 3;
        });

        Thread thread2 = new Thread(() -> {
            y = x + 99;
        });
        thread1.start();
        /**
         * 输出结果可能为3 或者为101
         *
         * 因为线程的执行顺序不一定。如果需要用x=2的值，需要加上thread.join()
         */
        thread1.join();
        thread2.start();
        Thread.sleep(100);
        System.out.println("result:" + y);
    }
}
