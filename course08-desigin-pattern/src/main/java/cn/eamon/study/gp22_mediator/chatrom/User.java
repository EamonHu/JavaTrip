package cn.eamon.study.gp22_mediator.chatrom;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:09
 */
public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String msg){
        this.chatRoom.showMsg(this,msg);
    }
}
