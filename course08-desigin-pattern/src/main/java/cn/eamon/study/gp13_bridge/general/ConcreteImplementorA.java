package cn.eamon.study.gp13_bridge.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/28 23:51
 */
public class ConcreteImplementorA implements IImplementor {
    @Override
    public void operationImpl() {
        System.out.println("IImplementor 的实现类A");
    }
}
