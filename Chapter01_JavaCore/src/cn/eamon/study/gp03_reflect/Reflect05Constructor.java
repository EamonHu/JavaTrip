package cn.eamon.study.gp03_reflect;

import java.lang.reflect.Constructor;

/**
 * @author eamon
 * @date 2021/7/1  12:48 上午
 */
public class Reflect05Constructor {

    public static void main(String[] args) throws Exception{
        Class<User> userClass = User.class;
        User user = userClass.newInstance();

        // 获取当前类和父类的公有构造器
        Constructor<?>[] constructors = userClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getModifiers() +"==>"+constructor.getName());
        }
        /**
         * 1==>cn.eamon.study.gp03_reflect.User
         * 1==>cn.eamon.study.gp03_reflect.User
         */
        System.out.println("==================");

        // 获取当前类所有构造器
        Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getModifiers()+"==>"+declaredConstructor.getName());
        }
        /**
         * 1==>cn.eamon.study.gp03_reflect.User
         * 2==>cn.eamon.study.gp03_reflect.User
         * 1==>cn.eamon.study.gp03_reflect.User
         */
        System.out.println("==================");

        Constructor<User> declaredConstructor = userClass.getDeclaredConstructor(String.class, String.class);
        declaredConstructor.setAccessible(true);
        System.out.println(declaredConstructor.newInstance("公有姓名","私有姓名"));

    }
}
