package cn.eamon.study.gp19_command.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 18:08
 */
public class ConcreteCommand implements ICommand {
    // 直接创建接收者，不暴露给客户端
    private Receiver mReceiver = new Receiver();

    public void execute() {
        this.mReceiver.action();
    }
}
