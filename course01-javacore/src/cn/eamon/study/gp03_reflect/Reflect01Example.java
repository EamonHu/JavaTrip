package cn.eamon.study.gp03_reflect;

/**
 * @author eamon
 * @date 2021/6/30  11:25 下午
 */
public class Reflect01Example {

    public static void main(String[] args) throws Exception {
        String key = "BasketBall";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            getInstanceByKey(key);
        }
        long end = System.currentTimeMillis();
        System.out.println("直接创造实例耗时：" + (end - start)); //9毫秒

        System.out.println("==========");

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            getInstanceReflectByKey(key);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("反射创造实例耗时：" + (end2 - start2)); //1043毫秒
    }

    /**
     * 通过key来创建实例
     *
     * @param key
     * @return
     */
    public static void getInstanceByKey(String key) {
        if ("BasketBall".equals(key)) {
            new BasketBall();
        }
        if ("FootBall".equals(key)) {
            new FootBall();
        }
    }

    /**
     * 通过反射来动态获取对象
     */
    public static Ball getInstanceReflectByKey(String key) throws Exception {
        String basePackage = "cn.eamon.study.gp03_reflect";
        Ball ball = null;
        try {
            Class<?> clazz = Class.forName(basePackage + "." + key);
            ball = (Ball) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ball;
    }
}
