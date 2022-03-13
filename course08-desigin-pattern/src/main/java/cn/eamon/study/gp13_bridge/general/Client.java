package cn.eamon.study.gp13_bridge.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/28 23:52
 */
public class Client {
    public static void main(String[] args) {
        // 来一个实现化角色
        ConcreteImplementorA imp = new ConcreteImplementorA();
        // 来一个抽线化角色，聚合实现
        RefinedAbstraction abs = new RefinedAbstraction(imp);
        // 执行操作
        abs.operaiton();
    }
}
