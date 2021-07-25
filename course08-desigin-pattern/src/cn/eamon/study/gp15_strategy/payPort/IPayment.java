package cn.eamon.study.gp15_strategy.payPort;

import cn.eamon.study.gp15_strategy.Result;

/**
 * @Author: Eamon
 * @Description: 支付方式抽象类
 * @Date: 2021/7/25 21:26
 */
public interface IPayment {

    /**
     * 获取支付方式名称
     *
     * @return 支付方式名
     */
    String getName();

    /**
     * 支付
     *
     * @param uid    用户ID
     * @param amount 待支付金额
     * @return 支付结果
     */
    default Result pay(String uid, double amount) {
        // 确保余额是否足够
        if (queryBalance(uid) < amount) {
            return new Result("支付失败，余额不足", false);
        }
        return new Result("支付成功，支付金额：" + amount, true);
    }

    /**
     * 获取余额
     *
     * @param uid 用户ID
     * @return 用户余额
     */
    double queryBalance(String uid);
}
