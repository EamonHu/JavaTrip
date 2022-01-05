package cn.eamon.study.gp02_factory.courseImpl;

import cn.eamon.study.gp02_factory.ICourse;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/4 23:17
 */
public class EnglishCourseImpl implements ICourse {
    @Override
    public void create() {
        System.out.println("EnglishCourseImpl创建了英语课程");
    }
}
