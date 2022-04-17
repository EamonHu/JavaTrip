package cn.eamon.study.gp24_observer.zher;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 17:20
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        ZHer zher = (ZHer)o;
        Question question = (Question)arg;
        System.out.println("======================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自" + zher.getName() + "的提问，希望您解答。问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
