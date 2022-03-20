package cn.eamon.study.gp16_strategy.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 17:00
 */
public class ConcreteStrategyB implements IStrategy {
    @Override
    public void algorithm() {
        System.out.println("Strategy B");
    }
}
