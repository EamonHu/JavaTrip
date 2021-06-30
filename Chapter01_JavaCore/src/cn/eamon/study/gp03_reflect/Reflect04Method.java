package cn.eamon.study.gp03_reflect;

import java.lang.reflect.Method;

/**
 * @author eamon
 * @date 2021/7/1  12:36 上午
 */
public class Reflect04Method {

    public static void main(String[] args) throws Exception{
        Class<User> userClass = User.class;
        User user = userClass.newInstance();

        // 获取当前类和父类中的所有公有方法
        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getModifiers()+"==>"+method.getName());
        }
        /**
         * 当前类User，父类Person，祖类Object
         *
         * 9==>say
         * 1==>getUserPrivateName
         * 1==>getUserPublicName
         * 9==>userPublic
         * 1==>personPublicMethod
         * 17==>wait
         * 273==>wait
         * 17==>wait
         * 1==>equals
         * 1==>toString
         * 257==>hashCode
         * 273==>getClass
         * 273==>notify
         * 273==>notifyAll
         */
        System.out.println("======以上为当前类和父类中的所有公有方法=========");

        Method[] declaredMethods = userClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getModifiers()+"==>"+declaredMethod.getName());
        }
        /**
         * 9==>say
         * 2==>userPrivate
         * 1==>getUserPrivateName
         * 1==>getUserPublicName
         * 9==>userPublic
         */
        System.out.println("=====以上为当前类所有方法包括私有============");

        // 放开私有方法的调用
        Method userPrivate = userClass.getDeclaredMethod("userPrivate");
        userPrivate.setAccessible(true);
        userPrivate.invoke(user);//user类中的私有方法被执行。。。

        //静态方法的调用
        Method say = userClass.getMethod("say", String.class);
        say.invoke(null, "风雨中 这点痛 算什么");//他说：风雨中 这点痛 算什么
    }
}
