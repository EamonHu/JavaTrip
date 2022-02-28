package cn.eamon.study.gp11_compositepattern.general.demo.safe;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 23:42
 */
public abstract class Directory {
    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    public abstract void show();

}
