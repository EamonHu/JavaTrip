package cn.eamon.study.gp17_chain.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 20:55
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("requestB".equals(request)) {
            System.out.println(this.getClass().getSimpleName() + "deal with request: " + request);
            return;
        }
        if (this.nextHandler != null) {
            this.nextHandler.handleRequest(request);
        }
    }
}
