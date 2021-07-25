package cn.eamon.study.gp04_JUC;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/24 14:06
 */
public class Juc02Semaphore {
    public static void main(String[] args) {
        //当前可以获得的最大许可数量是5个
        //AQS   ->state
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 10; i++) {
            new Car(i, semaphore).start();
        }
    }

    static class Car extends Thread {
        private int num;
        private Semaphore semaphore;

        public Car(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire(); //获得一个许可,如果获取不到许可，就会被阻塞
                System.out.println("第" + num + " 占用一个停车位");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("第" + num + "  辆车走了");
                semaphore.release(); //释放许可
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
