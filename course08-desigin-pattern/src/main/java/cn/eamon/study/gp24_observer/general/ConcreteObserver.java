package cn.eamon.study.gp24_observer.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 17:16
 */
public class ConcreteObserver<E> implements IObserver<E> {
    @Override
    public void update(Object event) {
        System.out.println("receive event: " + event);
    }
}
