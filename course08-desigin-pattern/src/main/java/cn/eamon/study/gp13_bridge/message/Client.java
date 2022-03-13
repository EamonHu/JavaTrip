package cn.eamon.study.gp13_bridge.message;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/1 0:43
 */
public class Client {

    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage absMessage = new NormalMessage(message);
        absMessage.sendMessage("加班申请", "刘总");

        message = new EmailMessage();
        absMessage = new UrgencyMessage(message);
        absMessage.sendMessage("加班申请", "刘总");
    }
}
//使用短信消息发送加班申请给刘总
//使用邮件消息发送：【加急】加班申请给刘总
