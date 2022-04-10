package cn.eamon.study.gp22_mediator.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 20:45
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
        colleagueA.depMethodA();
        System.out.println("-------------------------");
        colleagueB.depMethodB();
    }
}
