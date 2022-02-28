package cn.eamon.study.gp12_adapter.general.interface_adapter;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/27 21:46
 */
public class Client {

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        int res = adapter.outPut5V();
        System.out.println("接口适配器输出电压：" + res);
    }
}
//电压=220
//接口适配器输出电压：5
