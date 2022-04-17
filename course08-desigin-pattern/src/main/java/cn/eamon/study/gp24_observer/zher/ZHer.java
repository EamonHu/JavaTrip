package cn.eamon.study.gp24_observer.zher;

import java.util.Observable;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 17:18
 */
public class ZHer extends Observable {
    private String name = "知乎知识圈";

    private static final ZHer zher = new ZHer();

    private ZHer() {
    }

    public static ZHer getInstance() {
        return zher;
    }

    public String getName() {
        return this.name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
