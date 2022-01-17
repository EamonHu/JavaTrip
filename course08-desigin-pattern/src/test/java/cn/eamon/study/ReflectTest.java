package cn.eamon.study;

import cn.eamon.study.gp04_singleton.lazy.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/16 3:17
 */
public class ReflectTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyStaticInnerClassSingleton.class;
            Constructor declaredConstructor = clazz.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            Object instance1 = declaredConstructor.newInstance();
            Object instance2 = declaredConstructor.newInstance();
            System.out.println(instance1 == instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
