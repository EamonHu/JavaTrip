package cn.eamon.study;

import java.lang.reflect.Proxy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/30 17:33
 */
public class RpcProxyClient {

    public <T> T clientProxy(Class<T> clazz, String host, int port) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),new Class<?>[]{clazz},new RemoteInvocationHandler(host, port));
    }
}