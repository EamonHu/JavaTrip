package cn.eamon.study.gp12_adapter.general.class_adpter;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/27 21:46
 */
public class Client {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        int res = adapter.outPut5V();
        System.out.println("类适配器输出电压：" + res);
    }
}
//电压=220
//类适配器输出电压：5