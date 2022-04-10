package cn.eamon.study.gp22_mediator.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 20:43
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
        this.mediator.setColleageB(this);
    }

    // 自有方法：self-Method
    public void selfMethodB() {
        // 处理自己的逻辑
        System.out.printf("%s:self-Method%n", this.getClass().getSimpleName());
    }

    // 依赖方法：dep-Method
    public void depMethodB() {
        // 处理自己的逻辑
        System.out.printf("%s:depMethod: delegate to Mediator%n", this.getClass().getSimpleName());
        // 无法处理的业务逻辑委托给中介者处理
        this.mediator.transferB();
    }
}
