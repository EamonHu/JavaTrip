package cn.eamon.study.gp02_factory.courseImpl;

import cn.eamon.study.gp02_factory.ICourse;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/4 23:17
 */
public class MathCourseImpl implements ICourse {
    @Override
    public void create() {
        System.out.println("MathCourseImpl创建了数学课程");
    }
}
