package cn.eamon.study.gp12_adapter.general.class_adpter;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/27 21:45
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public int outPut5V() {
        int srcV = output220V();
        return srcV / 44;
    }
}
