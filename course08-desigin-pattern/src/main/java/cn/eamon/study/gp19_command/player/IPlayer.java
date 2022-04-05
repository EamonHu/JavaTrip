package cn.eamon.study.gp19_command.player;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 18:25
 */
public class IPlayer {
    public void play(){
        System.out.println("正常播放");
    }

    public void speed(){
        System.out.println("拖动进度条");
    }

    public void stop(){
        System.out.println("停止播放");
    }

    public void pause(){
        System.out.println("暂停播放");
    }
}
