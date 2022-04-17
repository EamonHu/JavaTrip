package cn.eamon.study.gp25_vistor.kpi;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:25
 */
public interface IVisitor {
    void visit(Engineer engineer);

    void visit(Manager manager);
}
