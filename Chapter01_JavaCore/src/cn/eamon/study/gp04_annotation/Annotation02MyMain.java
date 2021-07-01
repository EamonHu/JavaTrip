package cn.eamon.study.gp04_annotation;

import java.lang.reflect.Method;

/**
 * @author eamon
 * @date 2021/7/2  12:38 上午
 */
@Annotation01InvokAnno(className = "cn.eamon.study.gp04_annotation.Annotation03Student", methodName = "show")
public class Annotation02MyMain {
    public static void main(String[] args) throws Exception{
        // 获取类对象
        Class<Annotation02MyMain> myMainClass = Annotation02MyMain.class;
        // 获取类对象的注解
        Annotation01InvokAnno annotation = myMainClass.getAnnotation(Annotation01InvokAnno.class);

        // 获取注解中对应的属性
        String className = annotation.className();
        String methodName = annotation.methodName();

        // 反射实现接口的功能
        Class<?> aClass = Class.forName(className);
        Method show = aClass.getDeclaredMethod("show");
        Object o = aClass.newInstance();
        show.invoke(o);
    }
}
