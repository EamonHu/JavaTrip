package cn.eamon.study.gp03_safety;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/7 15:04
 */
public class Safety04ThreadLocal {

    public static final ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0; //初始值
        }
    };

    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        //希望每个线程都拿到的是0
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> {
                int num = local.get(); //拿到初始值
                num += 5;
                local.set(num);
                System.out.println(Thread.currentThread().getName() + "->" + num);
            }, "Thread-" + (i+1));
        }
        for (Thread thread : threads) {
            thread.start();
        }
    }
}
