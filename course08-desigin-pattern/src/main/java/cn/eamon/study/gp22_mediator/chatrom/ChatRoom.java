package cn.eamon.study.gp22_mediator.chatrom;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:10
 */
public class ChatRoom {

    public void showMsg(User user,String msg){
        System.out.println("[" + user.getName() + "] : " + msg);
    }
}
