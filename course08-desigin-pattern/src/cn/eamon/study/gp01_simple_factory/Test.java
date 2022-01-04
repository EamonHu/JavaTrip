package cn.eamon.study.gp01_simple_factory;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/4 23:16
 */
public class Test {
    public static void main(String[] args) {
        // 直接创建
        MathCourse mathCourse = new MathCourse();
        mathCourse.create();

        // 面向接口创建
        Course course = new MathCourseImpl();
        course.create();
        Course course1 = new EnglishCourseImpl();
        course1.create();

        // 简单工厂创建
        // 通过if判断创建
        CourseFactory courseFactory = new CourseFactory();
        Course mathCourseIf = courseFactory.createByIf("math");
        System.out.println("=======if=========");
        mathCourseIf.create();
        System.out.println("=======if=========");

        // 通过反射创建
        System.out.println("=======reflect=========");
        courseFactory.createByReflect("cn.eamon.study.gp01_simple_factory.EnglishCourseImpl").create();
        System.out.println("=======reflect=========");

        // 通过反射+泛型指定创建课程
        System.out.println("=======reflect+extends=========");
        courseFactory.createByReflectExtends(MathCourseImpl.class).create();
        System.out.println("=======reflect+extends=========");
    }
}
