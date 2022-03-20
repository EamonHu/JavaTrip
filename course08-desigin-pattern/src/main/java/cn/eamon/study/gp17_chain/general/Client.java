package cn.eamon.study.gp17_chain.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 20:56
 */
public class Client {

    public static void main(String[] args) {
        Handler A = new ConcreteHandlerA();
        Handler B = new ConcreteHandlerB();
        A.setNextHandler(B);
        A.handleRequest("requestB");
    }
}
