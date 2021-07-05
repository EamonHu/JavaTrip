package cn.eamon.study.gp03_reflect;

import java.lang.reflect.Field;

/**
 * @author eamon
 * @date 2021/7/1  12:13 上午
 */
public class Reflect03Fields {

    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;

        // getFields()方法可以获取类型中定义的字段：【公有字段】和【父类中的公有字段】
        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getModifiers() + "==>" + field.getName());
        }
        /**
         * 输出：
         * 1==>userPublicName
         * 9==>address
         * 1==>personPublicField
         */
        System.out.println("======以上为User及父类Person的公有字段==========");

        //getDeclaredFields()方法可以获取私有的字段，但只能获取【当前类】的私有字段
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getModifiers() + "==>" + declaredField.getName());
        }
        /**
         * 输出：
         * 1==>userPublicName
         * 2==>userPrivateName
         * 9==>address
         */
        System.out.println("======以上为User的所有字段=========");
        User user = userClass.newInstance();
        // 获取类中的公开属性信息
        Field userPublicName = userClass.getField("userPublicName");
        userPublicName.set(user, "user公开姓名");
        System.out.println(user.getUserPublicName());//输出：user公开姓名
        // 获取类中的私有属性信息，需要放开权限
        Field userPrivateName = userClass.getDeclaredField("userPrivateName");
        userPrivateName.setAccessible(true); // 私有属性必须放开权限，否则报错
        userPrivateName.set(user, "user私有姓名");
        System.out.println(user.getUserPrivateName());//输出：user私有姓名

        // 对静态属性赋值
        Field address = userClass.getDeclaredField("address");
        address.set(null, "安徽合肥");
        System.out.println(User.address);//输出：安徽合肥

    }

}
