package cn.eamon.study.gp01_simple_factory;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/4 23:17
 */
public class EnglishCourseImpl implements Course {
    @Override
    public void create() {
        System.out.println("EnglishCourseImpl创建了英语课程");
    }
}
