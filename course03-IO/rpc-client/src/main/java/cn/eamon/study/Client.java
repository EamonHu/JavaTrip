package cn.eamon.study;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/30 17:12
 */
public class Client {

    public static void main(String[] args) {
        RpcProxyClient client = new RpcProxyClient();
        IHelloService iHelloService = client.clientProxy(IHelloService.class, "127.0.0.1", 8098);
        System.out.println(iHelloService.sayHello("Eamon"));
    }
}
