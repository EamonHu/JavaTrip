package cn.eamon.study.gp25_vistor.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:13
 */
public class ConcreteElementA implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return this.getClass().getSimpleName();
    }
}
