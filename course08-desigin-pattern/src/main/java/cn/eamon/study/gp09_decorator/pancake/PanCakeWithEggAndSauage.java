package cn.eamon.study.gp09_decorator.pancake;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 23:17
 */
public class PanCakeWithEggAndSauage extends PanCakeWithEgg {
    protected String getMsg() {
        return super.getMsg() + ",再+1根香肠";
    }

    public int getPrice() {
        return super.getPrice() + 2;
    }
}
