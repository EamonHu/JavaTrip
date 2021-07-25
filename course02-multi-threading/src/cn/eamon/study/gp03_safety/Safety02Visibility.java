package cn.eamon.study.gp03_safety;

/**
 * @Author: Eamon
 * @Description: 可见性问题
 * @Date: 2021/7/7 10:31
 */
public class Safety02Visibility {
    public static boolean flag = false;

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
    }
}
