package cn.eamon.study.gp13_bridge.message;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/1 0:35
 */
public interface IMessage {
    // 发送消息的内容和接收人
    void send(String message, String toUser);
}
