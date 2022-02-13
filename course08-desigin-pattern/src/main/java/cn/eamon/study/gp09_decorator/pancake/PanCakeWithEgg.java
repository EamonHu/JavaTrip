package cn.eamon.study.gp09_decorator.pancake;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 23:16
 */
public class PanCakeWithEgg extends PanCake {

    protected String getMsg() {
        return super.getMsg() + ",加1个鸡蛋";
    }

    public int getPrice() {
        return super.getPrice() + 1;
    }
}
