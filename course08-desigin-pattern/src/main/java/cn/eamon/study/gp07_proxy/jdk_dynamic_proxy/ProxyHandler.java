package cn.eamon.study.gp07_proxy.jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/8 21:44
 */
public class ProxyHandler implements InvocationHandler {
    private Object obj;

    public ProxyHandler(Object _obj) {
        this.obj = _obj;
    }

    private void before() {
        System.out.println("演出之前，支付定金20w");
    }

    private void after() {
        System.out.println("演出结束，支付尾款30w");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object result = method.invoke(obj, args);
        this.after();
        return result;
    }
}
