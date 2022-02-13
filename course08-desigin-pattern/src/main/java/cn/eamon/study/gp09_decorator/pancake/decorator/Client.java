package cn.eamon.study.gp09_decorator.pancake.decorator;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 23:26
 */
public class Client {

    public static void main(String[] args) {
        PanCake panCake;
        panCake = new BasePanCake();
        // 加一个鸡蛋
        panCake = new EggPanCakeDecorator(panCake);
        // 再加一个鸡蛋
        panCake = new EggPanCakeDecorator(panCake);
        // 加一根香肠
        panCake = new SauageDecorator(panCake);
        System.out.println(panCake.getMsg() + "，总价" + panCake.getPrice());
    }
}
