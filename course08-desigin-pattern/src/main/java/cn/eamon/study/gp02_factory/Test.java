package cn.eamon.study.gp02_factory;

import cn.eamon.study.gp02_factory.ICourseFactoryImpl.EnglishCourseFactory;
import cn.eamon.study.gp02_factory.ICourseFactoryImpl.MathCourseFactory;
import org.slf4j.ILoggerFactory;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/4 23:51
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new MathCourseFactory();
        ICourse course = factory.create();
        course.create();
        factory = new EnglishCourseFactory();
        factory.create().create();

        // 可以对比类图
//        ILoggerFactory
    }
}
