package cn.eamon.study.gp12_adapter.general.interface_adapter;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/27 22:47
 */
public class TargetAdapter implements Target {
    @Override
    public int outPut5V() {
        return 0;
    }

    @Override
    public int outPut22V() {
        return 0;
    }

    @Override
    public String hello() {
        return null;
    }
}
