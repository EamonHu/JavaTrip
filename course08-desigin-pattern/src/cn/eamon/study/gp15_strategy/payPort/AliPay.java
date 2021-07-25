package cn.eamon.study.gp15_strategy.payPort;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/25 21:35
 */
public class AliPay implements IPayment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 900;
    }
}
