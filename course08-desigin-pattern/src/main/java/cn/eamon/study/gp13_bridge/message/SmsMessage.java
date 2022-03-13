package cn.eamon.study.gp13_bridge.message;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/1 0:38
 */
public class SmsMessage implements  IMessage{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用短信消息发送" + message + "给" +toUser);
    }
}
