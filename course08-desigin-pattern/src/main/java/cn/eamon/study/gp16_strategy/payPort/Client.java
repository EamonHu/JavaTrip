package cn.eamon.study.gp16_strategy.payPort;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 17:42
 */
public class Client {

    public static void main(String[] args) {
        PaymentContext paymentContext = null;
        Order order = new Order("11","22",330);
        IPayment pay;
        String payMethod = "AliPay";
        if(payMethod.equals("AliPay")){
            pay = new AliPay();
        }else if(payMethod.equals("JdPay")){
            pay = new JDPay();
        }else if(payMethod.equals("WechatPay")){
            pay = new WeChatPay();
        }else{
            pay = new AliPay();
        }
        paymentContext = new PaymentContext(pay, order);
        paymentContext.pay();
    }
}

//欢迎使用支付宝
//本次交易金额为：330.0,开始扣款
//Result{data=支付成功，支付金额：330.0, flag=true}