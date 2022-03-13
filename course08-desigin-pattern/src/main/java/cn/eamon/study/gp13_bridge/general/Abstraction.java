package cn.eamon.study.gp13_bridge.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/28 23:48
 */
public class Abstraction {

    protected IImplementor implementor;

    public Abstraction(IImplementor implementor) {
        this.implementor = implementor;
    }

    public void operaiton(){
        this.implementor.operationImpl();
    }
}
