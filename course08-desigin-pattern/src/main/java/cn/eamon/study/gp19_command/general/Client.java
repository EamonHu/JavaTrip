package cn.eamon.study.gp19_command.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 18:09
 */
public class Client {
    public static void main(String[] args) {
        ICommand cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
