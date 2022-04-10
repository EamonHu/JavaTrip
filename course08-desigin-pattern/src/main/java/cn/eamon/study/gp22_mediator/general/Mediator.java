package cn.eamon.study.gp22_mediator.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 20:42
 */
public abstract class Mediator {
    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;

    public void setColleageA(ConcreteColleagueA colleague) {
        this.colleagueA = colleague;
    }

    public void setColleageB(ConcreteColleagueB colleague) {
        this.colleagueB = colleague;
    }

    // 中介者业务逻辑
    public abstract void transferA();

    public abstract void transferB();
}
