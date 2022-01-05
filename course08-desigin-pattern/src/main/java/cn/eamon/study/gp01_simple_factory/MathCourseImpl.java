package cn.eamon.study.gp01_simple_factory;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/4 23:17
 */
public class MathCourseImpl implements Course {
    @Override
    public void create() {
        System.out.println("MathCourseImpl创建了数学课程");
    }
}
