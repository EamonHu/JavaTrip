package cn.eamon.study.gp18_iterator.general;

/**
 * @Author: Eamon
 * @Description: 抽象容器
 * @Date: 2022/4/5 16:30
 */
public interface IAggregate<E> {

    boolean add(E element);

    boolean remove(E element);

    Iterator<E> iterator();
}
