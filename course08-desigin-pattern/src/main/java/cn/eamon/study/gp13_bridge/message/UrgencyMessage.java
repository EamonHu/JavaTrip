package cn.eamon.study.gp13_bridge.message;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/1 0:41
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(IMessage message) {
        super(message);
    }

    void sendMessage(String message, String toUser) {
        message = "【加急】" + message;
        super.sendMessage(message, toUser);
    }

}
