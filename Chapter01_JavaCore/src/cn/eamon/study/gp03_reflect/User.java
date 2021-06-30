package cn.eamon.study.gp03_reflect;

/**
 * @author eamon
 * @date 2021/6/30  11:58 下午
 */
public class User extends Person {

    public String userPublicName;

    private String userPrivateName;

    public static String address;

    public User() {

    }

    private User(String publicName, String privateName) {
        this.userPublicName = publicName;
        this.userPrivateName = privateName;
    }

    public User(String userPublicName) {
        this.userPublicName = userPublicName;
    }

    public String getUserPrivateName() {
        return userPrivateName;
    }

    public String getUserPublicName() {
        return userPublicName;
    }

    private void userPrivate() {
        System.out.println("user类中的私有方法被执行。。。");
    }

    public void userPublic() {
        System.out.println("user类中的公有方法被执行。。。");
    }

    public static void say(String msg) {
        System.out.println("他说：" + msg);
    }
}
