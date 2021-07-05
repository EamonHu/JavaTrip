package cn.eamon.study.gp02_operation;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/5 18:18
 */
public class Operation06Interrupt {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
    }
}
