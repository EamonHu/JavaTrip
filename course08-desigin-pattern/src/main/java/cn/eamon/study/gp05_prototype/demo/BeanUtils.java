package cn.eamon.study.gp05_prototype.demo;

import java.lang.reflect.Field;

/**
 * @Author: Eamon
 * @Description: 类拷贝工具类
 * @Date: 2022/1/19 0:27
 */
public class BeanUtils {
    public static Object copy(Object prototype) {
        Class clazz = prototype.getClass();
        Object returnValue = null;
        try {
            returnValue = clazz.newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                field.set(returnValue, field.get(prototype));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
