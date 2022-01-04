package cn.eamon.study.gp17_strategy;

import cn.eamon.study.gp17_strategy.payPort.PayStrategy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/25 21:51
 */
public class TestStrategy {

    public static void main(String[] args) {
        Order order = new Order("1", "12490751390", 850);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
        System.out.println(order.pay(PayStrategy.JD_PAY));
        System.out.println(order.pay(PayStrategy.WECHAT_PAY));
    }
}
