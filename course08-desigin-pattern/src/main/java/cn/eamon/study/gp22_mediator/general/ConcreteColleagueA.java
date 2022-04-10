package cn.eamon.study.gp22_mediator.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 20:42
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
        this.mediator.setColleageA(this);
    }

    // 自有方法：self-Method
    public void selfMethodA() {
        // 处理自己的逻辑
        System.out.printf("%s:self-Method%n", this.getClass().getSimpleName());
    }

    // 依赖方法：dep-Method
    public void depMethodA() {
        // 处理自己的逻辑
        System.out.printf("%s:depMethod: delegate to Mediator%n", this.getClass().getSimpleName());
        // 无法处理的业务逻辑委托给中介者处理
        this.mediator.transferA();
    }
}
