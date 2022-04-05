package cn.eamon.study.gp19_command.player;

import cn.eamon.study.gp19_command.player.actions.PauseAction;
import cn.eamon.study.gp19_command.player.actions.PlayAction;
import cn.eamon.study.gp19_command.player.actions.SpeedAction;
import cn.eamon.study.gp19_command.player.actions.StopAction;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 18:31
 */
public class Client {
    public static void main(String[] args) {

        IPlayer player = new IPlayer();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));

        controller.addAction(new PauseAction(player));
        controller.addAction(new PlayAction(player));
        controller.addAction(new StopAction(player));
        controller.addAction(new SpeedAction(player));
        controller.executes();
    }
}

//输出：
//正常播放
//暂停播放
//正常播放
//停止播放
//拖动进度条
