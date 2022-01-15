package cn.eamon.study.gp04_singleton.hungry;

/**
 * @Author: Eamon
 * @Description: 饿汉式单例
 * @Date: 2022/1/13 0:02
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    public HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
