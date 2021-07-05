package cn.eamon.study.gp03_reflect;

/**
 * @author eamon
 * @date 2021/6/30  11:55 下午
 */
public class Reflect02Class {

    /**
     * 四种方式获取类对象
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Class<User> clazz1 = User.class;
        Class<?> clazz2 = Class.forName("cn.eamon.study.gp03_reflect.User");
        Class<? extends User> clazz3 = new User().getClass();
        Class<?> clazz4 = Reflect02Class.class.getClassLoader().loadClass("cn.eamon.study.gp03_reflect.User");

        System.out.println(clazz1.getModifiers()); // 返回此类或接口的Java语言修饰符，以整数编码。 修饰符由Java虚拟机的常数为public ， protected ， private ， final ， static ， abstract和interface ; 应使用Modifier类的方法进行解码。
        System.out.println(clazz1.getPackage());  // 获取报名 package cn.eamon.study.gp03_reflect
        System.out.println(clazz1.getSuperclass()); // 获取父类 class cn.eamon.study.gp03_reflect.Person
        System.out.println(clazz1.getClassLoader()); // 获取类加载器 sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(clazz1.getSimpleName()); // 获取简化类名
    }
}
