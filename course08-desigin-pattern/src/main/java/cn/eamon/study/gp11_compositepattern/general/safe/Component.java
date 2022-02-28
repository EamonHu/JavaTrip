package cn.eamon.study.gp11_compositepattern.general.safe;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 22:54
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();
}
