package cn.eamon.study.gp11_compositepattern.general.demo.transparent;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 23:19
 */
public abstract class Directory {

    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    public abstract void show();

    public boolean add(Directory dir){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public boolean remove(Directory dir) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public Directory get(int index) {
        throw new UnsupportedOperationException("不支持获取操作");
    }

    public void list(){
        throw new UnsupportedOperationException("不支持遍历操作");
    }
}
