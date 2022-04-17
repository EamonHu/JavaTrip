package cn.eamon.study.gp25_vistor.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:17
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure collection = new ObjectStructure();
        System.out.println("ConcreteVisitorA handle elements:");
        IVisitor visitorA = new ConcreteVisitorA();
        collection.accept(visitorA);
        System.out.println("------------------------------------");
        System.out.println("ConcreteVisitorB handle elements:");
        IVisitor visitorB = new ConcreteVisitorB();
        collection.accept(visitorB);
    }
}
//输出：
//ConcreteVisitorA handle elements:
//result from ConcreteElementA: ConcreteElementA
//result from ConcreteElementB: 88
//------------------------------------
//ConcreteVisitorB handle elements:
//result from ConcreteElementA: ConcreteElementA
//result from ConcreteElementB: 86

