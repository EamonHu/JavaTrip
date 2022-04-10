package cn.eamon.study.gp22_mediator.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 20:44
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void transferA() {
        // 协调行为:A 转发到 B
        this.colleagueB.selfMethodB();
    }

    @Override
    public void transferB() {
        // 协调行为:B 转发到 A
        this.colleagueA.selfMethodA();
    }
}
