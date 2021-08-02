package cn.eamon.study;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/30 17:42
 */
public class RemoteInvocationHandler implements InvocationHandler {

    private String host;
    private int port;


    public RemoteInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("触发了调用的代码");
        RpcRequest request = new RpcRequest();
        request.setClassName(method.getDeclaringClass().getName());
        request.setMethodName(method.getName());
        request.setParameters(args);
        request.setTypes(method.getParameterTypes());
        RpcNetTransport rpcNetTransport = new RpcNetTransport(host, port);
        return rpcNetTransport.send(request);
    }
}
