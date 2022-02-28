package cn.eamon.study.gp10_flyweight.jdk;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 14:30
 */
public class IntegerTest {
    public static void main(String[] args) {

        Integer a = Integer.valueOf(100);
        Integer b = 100;
        int f = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;
        int e = 1000;
        // 自动拆装箱
        System.out.println(f == b);
        System.out.println(e == d);
        System.out.println("a==b:" + (a == b)); // true
        System.out.println("c==d:" + (c == d)); // false
    }

}
