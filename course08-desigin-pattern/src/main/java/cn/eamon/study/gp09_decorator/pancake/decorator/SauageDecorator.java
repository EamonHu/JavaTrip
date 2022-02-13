package cn.eamon.study.gp09_decorator.pancake.decorator;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 23:25
 */
public class SauageDecorator extends PanCakeDecorator {
    public SauageDecorator(PanCake panCake) {
        super(panCake);
    }

    protected String getMsg(){ return super.getMsg() + ",加1根香肠";}

    public int getPrice(){ return super.getPrice() + 2;}
}
