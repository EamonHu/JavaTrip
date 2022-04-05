package cn.eamon.study.gp19_command.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 18:07
 */
public class Invoker {
    private ICommand mCmd;

    public Invoker(ICommand cmd) {
        this.mCmd = cmd;
    }

    public void action() {
        this.mCmd.execute();
    }
}
