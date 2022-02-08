package cn.eamon.study.gp07_proxy.cglib_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/8 21:55
 */
public class CglibProxyHandler implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    private void before() {
        System.out.println("演出之前，支付定金20w");
    }

    private void after() {
        System.out.println("演出结束，支付尾款30w");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        this.before();
        Object result = methodProxy.invokeSuper(o, objects);
        this.after();
        return result;
    }
}
