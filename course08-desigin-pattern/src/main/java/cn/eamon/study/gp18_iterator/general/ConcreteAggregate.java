package cn.eamon.study.gp18_iterator.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 16:32
 */
public class ConcreteAggregate<E> implements IAggregate<E> {
    private List<E> list = new ArrayList<>();

    @Override
    public boolean add(E element) {
        return this.list.add(element);
    }

    @Override
    public boolean remove(E element) {
        return this.list.remove(element);
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<E>(this.list);
    }
}
