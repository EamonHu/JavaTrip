package cn.eamon.study.gp10_flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Eamon
 * @Description: 享元工厂
 * @Date: 2022/2/20 13:25
 */
public class FlyweightFactory {

    private static final Map<String, IFlyweight> pool = new HashMap<>();

    // 因为内部状态具备不变性，因此作为缓存的键
    public static IFlyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
