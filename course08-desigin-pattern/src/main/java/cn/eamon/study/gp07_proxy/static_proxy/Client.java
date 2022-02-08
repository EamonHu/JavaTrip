package cn.eamon.study.gp07_proxy.static_proxy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/8 21:42
 */
public class Client {

    public static void main(String[] args) {
        StartInterface jay = new JayChou();
        Proxy proxy = new Proxy(jay);
        proxy.dance();
    }
}
