package cn.eamon.study;

import java.io.IOException;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/30 16:52
 */
public class ServerProvider {

    public static void main(String[] args) throws IOException {
        IHelloService service = new HelloServiceImpl();
        RpcProxyServer rpcProxyServer = new RpcProxyServer();
        rpcProxyServer.publish(service, 8098);
        System.out.println("rpc-server-provider正在监听...");
    }
}
