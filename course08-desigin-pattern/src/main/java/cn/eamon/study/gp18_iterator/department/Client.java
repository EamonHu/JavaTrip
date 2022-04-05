package cn.eamon.study.gp18_iterator.department;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 16:54
 */
public class Client {

    public static void main(String[] args) {
        Employee coder = new Employee("开发", "写代码");
        Employee tester = new Employee("测试", "黑白盒测试");
        Employee manager = new Employee("经理", "管理者");


        IEmployeeAggregate aggregate = new EmployeeAggregateImpl();
        aggregate.add(coder);
        aggregate.add(tester);
        aggregate.add(manager);

        System.out.println("===========员工列表==========");
        printCourse(aggregate);

        aggregate.remove(tester);

        System.out.println("===========删除操作之后的员工列表==========");
        printCourse(aggregate);
    }

    private static void printCourse(IEmployeeAggregate aggregate) {
        Iterator<Employee> i = aggregate.iterator();
        while (i.hasNext()) {
            Employee course = i.next();
            System.out.print("岗位：" + course.getName() + "     ");
            System.out.println("职责：" + course.getDuty());
        }
    }
}

//输出：
//===========员工列表==========
//当前位置 0 : 岗位：开发     职责：写代码
//当前位置 1 : 岗位：测试     职责：黑白盒测试
//当前位置 2 : 岗位：经理     职责：管理者
//===========删除操作之后的员工列表==========
//当前位置 0 : 岗位：开发     职责：写代码
//当前位置 1 : 岗位：经理     职责：管理者