package cn.eamon.study.gp25_vistor.kpi;

import java.util.Random;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:25
 */
public class Engineer extends Employee {
    public Engineer(String name) {
        super(name);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    //考核指标是每年的代码量
    public int getCodeLines(){
        return new Random().nextInt(10* 10000);
    }
}
