package cn.eamon.study.gp25_vistor.kpi;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:27
 */
public class CEOVisitor implements IVisitor{
    public void visit(Engineer engineer) {
        System.out.println("工程师" +  engineer.name + "，KIP：" + engineer.kpi);
    }

    public void visit(Manager manager) {
        System.out.println("经理：" +  manager.name + ",KPI:" + manager.kpi + "，产品数量：" + manager.getProducts());
    }
}

