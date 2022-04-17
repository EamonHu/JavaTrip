package cn.eamon.study.gp24_observer.zher;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 17:22
 */
public class Client {
    public static void main(String[] args) {
        ZHer zher = ZHer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher jerry = new Teacher("Jerry");

        zher.addObserver(tom);
        zher.addObserver(jerry);

        //用户行为
        Question question = new Question();
        question.setUserName("张三");
        question.setContent("观察者模式适用于哪些场景？");

        zher.publishQuestion(question);
    }
}
// 输出：
// 张三在知乎知识圈上提交了一个问题。
//======================
//Jerry老师，你好！
//您收到了一个来自知乎知识圈的提问，希望您解答。问题内容如下：
//观察者模式适用于哪些场景？
//提问者：张三
//======================
//Tom老师，你好！
//您收到了一个来自知乎知识圈的提问，希望您解答。问题内容如下：
//观察者模式适用于哪些场景？
//提问者：张三
