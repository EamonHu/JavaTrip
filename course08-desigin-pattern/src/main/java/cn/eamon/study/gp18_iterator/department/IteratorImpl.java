package cn.eamon.study.gp18_iterator.department;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 16:52
 */
public class IteratorImpl<E> implements Iterator<E> {
    private List<E> list;
    private int cursor;
    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.print("当前位置 " + cursor + " : ");
        element = list.get(cursor);
        cursor++;
        return element;
    }

    @Override
    public boolean hasNext() {
        return cursor <= list.size() - 1;
    }
}
