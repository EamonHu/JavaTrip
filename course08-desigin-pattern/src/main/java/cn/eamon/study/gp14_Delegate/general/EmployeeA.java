package cn.eamon.study.gp14_Delegate.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/13 21:53
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doTask(String task) {
        System.out.println("员工A-程序员，做任务：" + task);
    }
}
