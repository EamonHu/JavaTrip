package cn.eamon.study.gp22_mediator.general;

/**
 * @Author: Eamon
 * @Description: 抽象同事类
 * @Date: 2022/4/10 20:41
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
