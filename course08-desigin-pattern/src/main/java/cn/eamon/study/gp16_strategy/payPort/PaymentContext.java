package cn.eamon.study.gp16_strategy.payPort;

import cn.eamon.study.gp16_strategy.Result;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 17:39
 */
public class PaymentContext {

    private IPayment payment;

    private Order order;

    public PaymentContext(IPayment payment, Order order) {
        this.payment = payment;
        this.order = order;
    }

    public void pay(){
        System.out.println("欢迎使用"+payment.getName());
        System.out.println("本次交易金额为："+order.getAmount()+",开始扣款");
        Result pay = this.payment.pay(order.getUId(), order.getAmount());
        System.out.println(pay);
    }
}
