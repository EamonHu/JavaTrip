package cn.eamon.study.gp02_operation;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/5 16:18
 */
public class Operation02SleepDemo extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(3000);
            System.out.println("耗时:" + (System.currentTimeMillis() - start));
            // 耗时：3002
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Operation02SleepDemo().start();
    }
}
