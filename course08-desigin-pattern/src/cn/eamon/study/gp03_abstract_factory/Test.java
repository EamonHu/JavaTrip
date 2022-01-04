package cn.eamon.study.gp03_abstract_factory;

import cn.eamon.study.gp03_abstract_factory.factory.CourseFactory;
import cn.eamon.study.gp03_abstract_factory.factory.MathCourseFactory;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/5 0:21
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory factory = new MathCourseFactory();
        factory.createNote().edit();
        factory.createAnswer().speak();
    }
}
