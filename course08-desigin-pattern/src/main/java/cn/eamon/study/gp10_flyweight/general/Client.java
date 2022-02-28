package cn.eamon.study.gp10_flyweight.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 13:28
 */
public class Client {
    public static void main(String[] args) {
        IFlyweight flyweight1 = FlyweightFactory.getFlyweight("aa");
        IFlyweight flyweight2 = FlyweightFactory.getFlyweight("bb");
        flyweight1.operation("a");
        flyweight2.operation("b");
    }
}
