package cn.eamon.study.gp18_iterator.department;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 16:48
 */
public interface IEmployeeAggregate {

    void add(Employee employee);

    void remove(Employee employee);

    Iterator<Employee> iterator();
}
