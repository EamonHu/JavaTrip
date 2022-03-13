package cn.eamon.study.gp14_Delegate.general;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/13 21:53
 */
public class Leader implements IEmployee {

    private final Map<String, IEmployee> employeeMap = new HashMap<String, IEmployee>();

    public Leader() {
        employeeMap.put("爬虫", new EmployeeA());
        employeeMap.put("海报图", new EmployeeB());
    }

    @Override
    public void doTask(String task) {
        if (!employeeMap.containsKey(task)) {
            System.out.println("这个任务" + task + "超出我的能力范围");
            return;
        }
        employeeMap.get(task).doTask(task);
    }
}
