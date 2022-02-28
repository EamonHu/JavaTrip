package cn.eamon.study.gp11_compositepattern.general.demo.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 23:23
 */
public class Folder extends Directory {
    private List<Directory> dirs;

    private Integer level;

    public Folder(String name, Integer level) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<>();
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for (Directory dir : dirs) {
            // 控制显示格式
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    // 根据level控制空格输出
                    System.out.print("    ");
                }
                for (int i = 0; i < this.level; i++) {
                    if(i==0){
                        System.out.print("");
                    }
                    System.out.print("-");
                }
            }
            dir.show();
        }
    }

    @Override
    public boolean add(Directory dir) {
        return this.dirs.add(dir);
    }

    @Override
    public boolean remove(Directory dir) {
        return this.dirs.remove(dir);
    }

    @Override
    public Directory get(int index) {
        return this.dirs.get(index);
    }

    @Override
    public void list() {
        for (Directory dir : this.dirs) {
            System.out.println(dir.name);
        }
    }
}
