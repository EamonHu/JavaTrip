package cn.eamon.study.gp19_command.player.actions;

import cn.eamon.study.gp19_command.player.IAction;
import cn.eamon.study.gp19_command.player.IPlayer;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 18:27
 */
public class PlayAction implements IAction {
    private IPlayer palyer;

    public PlayAction(IPlayer palyer) {
        this.palyer = palyer;
    }

    public void execute() {
        palyer.play();
    }
}
