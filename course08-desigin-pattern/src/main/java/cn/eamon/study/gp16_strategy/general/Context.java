package cn.eamon.study.gp16_strategy.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 17:00
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm(){
        this.strategy.algorithm();
    }
}
