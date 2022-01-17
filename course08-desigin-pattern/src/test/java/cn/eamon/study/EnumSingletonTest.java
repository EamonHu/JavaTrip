package cn.eamon.study;

import cn.eamon.study.gp04_singleton.lazy.EnumSingleton;
import cn.eamon.study.gp04_singleton.lazy.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @Author: Eamon
 * @Description: 枚举式单例测试类
 * @Date: 2022/1/16 11:40
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        try {
//            Enum
            Class<?> clazz = EnumSingleton.class;
            Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
            declaredConstructor.setAccessible(true);
            Object instance1 = declaredConstructor.newInstance();
            Object instance2 = declaredConstructor.newInstance();
            System.out.println(instance1 == instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 使用枚举类操作单例
        EnumSingleton instance = EnumSingleton.getInstance();
        // 设置单例
        instance.setData(new Object());
        // 获取单例
        Object data = instance.getData();
        System.out.println(data);
    }
}
