package cn.eamon.study.gp25_vistor.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:12
 */
public interface IVisitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
