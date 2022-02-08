package cn.eamon.study.gp07_proxy.jdk_dynamic_proxy;

import cn.eamon.study.gp07_proxy.static_proxy.JayChou;
import cn.eamon.study.gp07_proxy.static_proxy.StartInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/8 21:45
 */
public class Client2 {
    public static void main(String[] args) {
        StartInterface jay = new JayChou();
        InvocationHandler handler = new ProxyHandler(jay);
        StartInterface proxyStar = (StartInterface) Proxy.newProxyInstance(jay.getClass().getClassLoader(), jay.getClass().getInterfaces(), handler);
        proxyStar.dance();
    }
}
