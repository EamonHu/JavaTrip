package cn.eamon.study.gp02_generic;

/**
 * @author eamon
 * @date 2021/6/30  1:06 上午
 */
public class GenericDemo05Method<T> {

    /**
     * 普通方法中 可以使用类中定义的泛型也可以使用方法中定义的泛型
     * @return
     */
    public T method1(){
        return (T)null;
    }

    public <K> K method2(T t){
        return (K)null;
    }

    /**
     * 静态方法中，不能使用类中定义的泛型
     * @param <E>
     * @return
     */
    public static <E> E method3(){
        return (E)null;
    }
}
