package cn.eamon.study.gp09_decorator.pancake;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 23:18
 */
public class Test {
    public static void main(String[] args) {
        PanCake panCake = new PanCake();
        System.out.println(panCake.getMsg() + ", 总价" + panCake.getPrice());

        PanCakeWithEgg panCakeWithEgg = new PanCakeWithEgg();
        System.out.println(panCakeWithEgg.getMsg() + ", 总价" + panCakeWithEgg.getPrice());

        PanCakeWithEggAndSauage panCakeWithEggAndSauage = new PanCakeWithEggAndSauage();
        System.out.println(panCakeWithEggAndSauage.getMsg() + ", 总价" + panCakeWithEggAndSauage.getPrice());
    }
}
