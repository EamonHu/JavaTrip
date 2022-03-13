package cn.eamon.study.gp14_Delegate.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/13 21:54
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doTask(String task) {
        System.out.println("员工B-UI，做任务：" + task);
    }
}
