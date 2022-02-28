package cn.eamon.study.gp12_adapter.general.object_adapter;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/27 21:45
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int outPut5V() {
        int srcV = adaptee.output220V();
        return srcV / 44;
    }
}
