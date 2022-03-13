package cn.eamon.study.gp13_bridge.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/28 23:50
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(IImplementor implementor) {
        super(implementor);
    }

    @Override
    public void operaiton() {
        super.operaiton();
        System.out.println("refined operation");
    }
}
