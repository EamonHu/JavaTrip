package cn.eamon.study.gp15_template.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/14 0:41
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abc = new ConcreteClassA();
        abc.templateMethod();
        System.out.println("==========");
        abc = new ConcreteClassB();
        abc.templateMethod();
    }
}
