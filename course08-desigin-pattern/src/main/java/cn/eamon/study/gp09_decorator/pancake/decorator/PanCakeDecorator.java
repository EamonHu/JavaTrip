package cn.eamon.study.gp09_decorator.pancake.decorator;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 23:22
 */
public class PanCakeDecorator extends PanCake{

    private  PanCake panCake;

    public PanCakeDecorator(PanCake panCake) {
        this.panCake = panCake;
    }

    @Override
    protected String getMsg() {
        return this.panCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.panCake.getPrice();
    }

    @Override
    protected void doSomething() {

    }
}
