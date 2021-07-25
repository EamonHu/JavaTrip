package cn.eamon.study.gp04_JUC;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: Eamon
 * @Description: CountDownLatch演示类
 * @Date: 2021/7/24 11:14
 */
public class JUC01CountDownLatch {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        new Thread(()->{
            System.out.println("线程1执行完毕");
            countDownLatch.countDown();
        }).start();

        new Thread(()->{
            try {
                Thread.sleep(3000);
                System.out.println("线程2执行完毕");
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            System.out.println("线程3执行完毕");
            countDownLatch.countDown();
        }).start();

        countDownLatch.await();
        System.out.println("主线程执行完毕");
    }
}
