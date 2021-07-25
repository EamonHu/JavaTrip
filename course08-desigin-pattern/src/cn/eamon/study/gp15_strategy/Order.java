package cn.eamon.study.gp15_strategy;

import cn.eamon.study.gp15_strategy.payPort.IPayment;
import cn.eamon.study.gp15_strategy.payPort.PayStrategy;
/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/25 21:45
 */
public class Order {

    private String uId;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount){
        this.uId = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public Result pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public Result pay(String payKey){
        IPayment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用"+payment.getName());
        System.out.println("本次交易金额为："+amount+",开始扣款");
        return payment.pay(uId,amount);
    }
}
