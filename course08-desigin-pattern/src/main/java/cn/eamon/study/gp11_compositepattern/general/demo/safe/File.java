package cn.eamon.study.gp11_compositepattern.general.demo.safe;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 23:43
 */
public class File extends Directory {
    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }

}
