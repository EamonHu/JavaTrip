package cn.eamon.study.gp03_abstract_factory.courseImpl;

import cn.eamon.study.gp03_abstract_factory.ICourse;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/4 23:17
 */
public class EnglishCourseImpl implements ICourse {
    @Override
    public void create() {
        System.out.println("EnglishCourse创建了英语课程");
    }
}
