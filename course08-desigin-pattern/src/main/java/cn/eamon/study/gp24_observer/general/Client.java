package cn.eamon.study.gp24_observer.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 17:16
 */
public class Client {

    public static void main(String[] args) {
        // 被观察者
        ISubject<String> observable = new ConcreteSubject<String>();
        // 观察者
        IObserver<String> observer = new ConcreteObserver<String>();
        // 注册
        observable.attach(observer);
        // 通知
        observable.notify("hello");
    }
}
