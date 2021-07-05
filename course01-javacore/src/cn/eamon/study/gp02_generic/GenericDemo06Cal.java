package cn.eamon.study.gp02_generic;

/**
 * @author eamon
 * @date 2021/6/30  1:13 上午
 */
public interface GenericDemo06Cal <T> {

    T add(T a, T b);

    T sub(T a, T b);

    T mul(T a, T b);

    T div(T a, T b);
}
