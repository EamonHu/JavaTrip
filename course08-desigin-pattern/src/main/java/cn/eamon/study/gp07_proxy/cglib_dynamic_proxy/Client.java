package cn.eamon.study.gp07_proxy.cglib_dynamic_proxy;

import cn.eamon.study.gp07_proxy.static_proxy.StartInterface;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/8 22:01
 */
public class Client {

    public static void main(String[] args) {
        JayChou jayChou = (JayChou) new CglibProxyHandler().getInstance(JayChou.class);
        jayChou.dance();
    }
}
