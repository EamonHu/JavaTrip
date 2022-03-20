package cn.eamon.study.gp16_strategy.payPort;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/25 21:35
 */
public class WeChatPay implements IPayment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 1000;
    }
}
