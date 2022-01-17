package cn.eamon.study.gp04_singleton.lazy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/16 3:12
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        if(LazyHolder.INSTANCE != null){
            throw new RuntimeException("不允许非法访问！");
        }
    }

    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    /**
     * 静态内部类
     * 看似是饿汉式单例，实际是懒汉式单例
     * Java特性：静态内部类在初始化的时候不会被读取，在使用的时候才会加载
     * LazyStaticInnerClassSingleton.class
     * LazyStaticInnerClassSingleton$LazyHolder.class
     *
     * 优点：写法优雅，性能高，避免了内存浪费，线程安全
     * 缺点：能够被反射破坏
     */
    private static class LazyHolder{
        private static final  LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
