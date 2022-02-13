package cn.eamon.study.gp09_decorator.pancake.decorator;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 23:22
 */
public class EggPanCakeDecorator extends PanCakeDecorator {
    public EggPanCakeDecorator(PanCake panCake) {
        super(panCake);
    }

    protected String getMsg() {
        return super.getMsg() + ",加1个鸡蛋";
    }

    public int getPrice() {
        return super.getPrice() + 1;
    }
}
