package cn.eamon.study.gp18_iterator.department;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 16:50
 */
public class EmployeeAggregateImpl implements IEmployeeAggregate {

    private List employeeList;

    public EmployeeAggregateImpl() {
        this.employeeList = new ArrayList();
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new IteratorImpl<Employee>(employeeList);
    }
}
