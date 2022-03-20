package cn.eamon.study.gp16_strategy.payPort;

import cn.eamon.study.gp16_strategy.payPort.Order;
import cn.eamon.study.gp16_strategy.payPort.PayStrategy;

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

//欢迎使用支付宝
//本次交易金额为：850.0,开始扣款
//Result{data=支付成功，支付金额：850.0, flag=true}
//欢迎使用京东支付
//本次交易金额为：850.0,开始扣款
//Result{data=支付失败，余额不足, flag=false}
//欢迎使用微信支付
//本次交易金额为：850.0,开始扣款
//Result{data=支付成功，支付金额：850.0, flag=true}