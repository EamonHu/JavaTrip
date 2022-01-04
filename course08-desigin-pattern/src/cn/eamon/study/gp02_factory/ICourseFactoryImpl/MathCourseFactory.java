package cn.eamon.study.gp02_factory.ICourseFactoryImpl;

import cn.eamon.study.gp02_factory.ICourse;
import cn.eamon.study.gp02_factory.ICourseFactory;
import cn.eamon.study.gp02_factory.courseImpl.MathCourseImpl;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/4 23:49
 */
public class MathCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new MathCourseImpl();
    }
}
