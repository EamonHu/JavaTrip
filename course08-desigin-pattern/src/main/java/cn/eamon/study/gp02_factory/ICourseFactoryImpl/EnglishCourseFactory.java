package cn.eamon.study.gp02_factory.ICourseFactoryImpl;

import cn.eamon.study.gp02_factory.ICourse;
import cn.eamon.study.gp02_factory.ICourseFactory;
import cn.eamon.study.gp02_factory.courseImpl.EnglishCourseImpl;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/4 23:50
 */
public class EnglishCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new EnglishCourseImpl();
    }
}
