package cn.eamon.study.gp18_iterator.department;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 16:49
 */
public interface Iterator<E> {
    E next();

    boolean hasNext();
}
