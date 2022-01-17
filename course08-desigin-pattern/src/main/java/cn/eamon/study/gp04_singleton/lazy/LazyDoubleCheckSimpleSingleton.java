package cn.eamon.study.gp04_singleton.lazy;

/**
 * @Author: Eamon
 * @Description: 饿汉式单例
 * @Date: 2022/1/13 0:09
 */
public class LazyDoubleCheckSimpleSingleton {
    /**
     * volatile解决指令重排序的问题
     */
    private volatile static LazyDoubleCheckSimpleSingleton instance;

    private LazyDoubleCheckSimpleSingleton() {
    }

    public static LazyDoubleCheckSimpleSingleton getInstance() {
        // 检查是否需要阻塞
        if (instance == null) {
            synchronized (LazyDoubleCheckSimpleSingleton.class) {
                // 检查是否还要创建单例
                if (instance == null) {
                    instance = new LazyDoubleCheckSimpleSingleton();
                }
            }
        }
        return instance;
    }
}
