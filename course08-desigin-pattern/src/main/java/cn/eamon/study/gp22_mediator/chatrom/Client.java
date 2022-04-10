package cn.eamon.study.gp22_mediator.chatrom;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:10
 */
public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User tom = new User("Tom", chatRoom);
        User jerry = new User("Jerry", chatRoom);

        tom.sendMessage("Hi! I am Tom.");
        jerry.sendMessage("Hello! My name is Jerry.");
    }
}
//输出：
//[Tom] : Hi! I am Tom.
//[Jerry] : Hello! My name is Jerry.
