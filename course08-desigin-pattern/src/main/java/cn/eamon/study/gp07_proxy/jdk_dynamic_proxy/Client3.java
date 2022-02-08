package cn.eamon.study.gp07_proxy.jdk_dynamic_proxy;

import cn.eamon.study.gp07_proxy.static_proxy.JJ;
import cn.eamon.study.gp07_proxy.static_proxy.JayChou;
import cn.eamon.study.gp07_proxy.static_proxy.StartInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/8 21:47
 */
public class Client3 {
    public static void main(String[] args) {
        StartInterface jay = new JayChou();
        StartInterface jj = new JJ();

        InvocationHandler handler = new ProxyHandler(jay);
        InvocationHandler jjHandler = new ProxyHandler(jj);

        StartInterface proxyJay = (StartInterface) Proxy.newProxyInstance(jay.getClass().getClassLoader(), jay.getClass().getInterfaces(), handler);
        StartInterface proxyJJ = (StartInterface) Proxy.newProxyInstance(jj.getClass().getClassLoader(), jj.getClass().getInterfaces(), jjHandler);

        proxyJay.dance();
        proxyJJ.dance();
    }
}
