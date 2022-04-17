package cn.eamon.study.gp24_observer.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 17:15
 */
//抽象观察者
public interface IObserver<E> {
    void update(E event);
}
