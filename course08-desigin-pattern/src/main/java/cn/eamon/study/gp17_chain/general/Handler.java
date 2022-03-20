package cn.eamon.study.gp17_chain.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 20:54
 */
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler successor) {
        this.nextHandler = successor;
    }

    public abstract void handleRequest(String request);
}
