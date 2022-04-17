package cn.eamon.study.gp25_vistor.general;

import java.util.Random;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:13
 */
public class ConcreteElementB implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public Integer operationB() {
        return new Random().nextInt(100);
    }
}
