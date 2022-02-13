package cn.eamon.study.gp09_decorator.pancake.decorator;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 23:21
 */
public class BasePanCake extends PanCake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }

    @Override
    protected void doSomething() {

    }
}
