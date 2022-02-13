package cn.eamon.study.gp08_facade;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 21:21
 */
public class PaymentService {

    public boolean pay(GifInfo git) {
        System.out.println("扣减" + git.getName() + " 积分成功");
        return true;
    }
}
