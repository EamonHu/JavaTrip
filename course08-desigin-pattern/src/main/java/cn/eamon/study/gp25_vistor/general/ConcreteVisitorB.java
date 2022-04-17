package cn.eamon.study.gp25_vistor.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:14
 */
public class ConcreteVisitorB implements IVisitor {
    public void visit(ConcreteElementA element) {
        String result = element.operationA();
        System.out.println("result from " + element.getClass().getSimpleName() + ": " + result);
    }


    public void visit(ConcreteElementB element) {
        int result = element.operationB();
        System.out.println("result from " + element.getClass().getSimpleName() + ": " + result);
    }
}
