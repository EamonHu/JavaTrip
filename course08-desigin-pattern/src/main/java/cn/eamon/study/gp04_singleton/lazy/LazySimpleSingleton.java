package cn.eamon.study.gp04_singleton.lazy;

/**
 * @Author: Eamon
 * @Description: 饿汉式单例
 * @Date: 2022/1/13 0:09
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;

    private LazySimpleSingleton() {
    }

    public static LazySimpleSingleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
