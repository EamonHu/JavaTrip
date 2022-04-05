package cn.eamon.study.gp19_command.player.actions;

import cn.eamon.study.gp19_command.player.IAction;
import cn.eamon.study.gp19_command.player.IPlayer;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 18:28
 */
public class SpeedAction implements IAction {
    private IPlayer palyer;

    public SpeedAction(IPlayer palyer) {
        this.palyer = palyer;
    }

    public void execute() {
        palyer.speed();
    }
}
