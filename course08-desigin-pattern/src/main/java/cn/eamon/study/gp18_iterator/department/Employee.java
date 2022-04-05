package cn.eamon.study.gp18_iterator.department;

import lombok.Data;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 16:47
 */
@Data
public class Employee {

    public Employee(String name, String duty) {
        this.name = name;
        this.duty = duty;
    }

    /**
     * 岗位名称
     */
    private String name;

    /**
     * 岗位职责
     */
    private String duty;
}
