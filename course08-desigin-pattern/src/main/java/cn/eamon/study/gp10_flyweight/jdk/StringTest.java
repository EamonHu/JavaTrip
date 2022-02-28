package cn.eamon.study.gp10_flyweight.jdk;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 14:22
 */
public class StringTest {
    public static void main(String[] args) {
        // “hello"是常量，在编译阶段完成创建；
        // s1是在运行阶段申明的，会把”hello“的地址赋值给s1
        String s1 = "hello";
        String s2 = "hello";
        // jdk优化，会把”he" + "llo" 编译成“hello"
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        // 拿到s5的常量地址 intern()方法
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//true
        System.out.println(s1 == s4);//false
        System.out.println(s1 == s5);//false
        System.out.println(s4 == s5);//false
        System.out.println(s1 == s9);//false
        System.out.println(s1 == s6);//true
    }
}
