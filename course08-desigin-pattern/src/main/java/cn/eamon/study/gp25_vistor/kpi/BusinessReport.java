package cn.eamon.study.gp25_vistor.kpi;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:28
 */
public class BusinessReport {
    private List<Employee> employees = new LinkedList<Employee>();

    public BusinessReport() {
        employees.add(new Manager("产品经理A"));
        employees.add(new Engineer("程序员A"));
        employees.add(new Engineer("程序员B"));
        employees.add(new Engineer("程序员C"));
        employees.add(new Manager("产品经理B"));
        employees.add(new Engineer("程序员D"));
    }

    public void showReport(IVisitor visitor){
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
