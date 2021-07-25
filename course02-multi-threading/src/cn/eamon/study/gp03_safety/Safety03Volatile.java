package cn.eamon.study.gp03_safety;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/7 14:13
 */
public class Safety03Volatile {
    public volatile static boolean flag = false;

    public static AtomicInteger atomicInteger = new AtomicInteger();


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (!flag) {
                i++;
            }
            System.out.println("result:" + i);
        });
        thread.start();
        System.out.println("begin start thread");
        Thread.sleep(1000);
        flag = true;
        atomicInteger.incrementAndGet();
    }
}
