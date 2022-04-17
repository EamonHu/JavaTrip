package cn.eamon.study.gp25_vistor.kpi;

import java.util.Random;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:25
 */
public abstract class Employee {
    public String name;
    public int kpi;  //员工KPI

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    //接收访问者的访问
    public abstract void accept(IVisitor visitor);
}
