package cn.eamon.study.gp24_observer.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 17:15
 */
public interface ISubject<E> {
    boolean attach(IObserver<E> observer);

    boolean detach(IObserver<E> observer);

    void notify(E event);
}
