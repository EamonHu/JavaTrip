package cn.eamon.study.gp07_proxy.static_proxy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/8 21:39
 */
public class Proxy implements StartInterface {

    private StartInterface start = new JayChou();

    public Proxy(StartInterface star) {
        this.start = star;
    }

    @Override
    public void dance() {
        this.before();
        start.dance();
        this.after();
    }

    private void after() {
        System.out.println("演出结束，支付尾款30w");
    }

    private void before() {
        System.out.println("演出之前，付定金20w");
    }
}
