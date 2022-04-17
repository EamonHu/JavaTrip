package cn.eamon.study.gp25_vistor.kpi;

import java.util.Random;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:26
 */
public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    //考核的是每年新产品研发数量
    public int getProducts(){
        return new Random().nextInt(10);
    }
}
