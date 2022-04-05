package cn.eamon.study.gp19_command.player.actions;

import cn.eamon.study.gp19_command.player.IAction;
import cn.eamon.study.gp19_command.player.IPlayer;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 18:26
 */
public class PauseAction implements IAction {
    private IPlayer player;

    public PauseAction(IPlayer player) {
        this.player = player;
    }

    public void execute() {
        player.pause();
    }
}
