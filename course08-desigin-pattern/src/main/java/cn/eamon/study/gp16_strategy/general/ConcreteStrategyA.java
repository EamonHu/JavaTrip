package cn.eamon.study.gp16_strategy.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 16:59
 */
public class ConcreteStrategyA implements IStrategy{
    @Override
    public void algorithm() {
        System.out.println("Strategy A");
    }
}
