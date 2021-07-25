package cn.eamon.study.gp03_safety;

/**
 * @Author: Eamon
 * @Description: 原子性问题
 * @Date: 2021/7/7 10:16
 */
public class Safety01Atomic {

    private static int count;

    public static void incr() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            new Thread(Safety01Atomic::incr).start();
        }
        Thread.sleep(4000);
        System.out.println("输出结果：" + count); //输出结果：929
    }
}
