package cn.eamon.study.gp17_strategy.payPort;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Eamon
 * @Description: 支付策略
 * @Date: 2021/7/25 21:37
 */
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, IPayment> payStrategy = new HashMap<>();

    static{
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(WECHAT_PAY, new WeChatPay());
        payStrategy.put(JD_PAY, new JDPay());
    }

    public static IPayment get(String payKey){
        if(!payStrategy.containsKey(payKey)){
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }
}
