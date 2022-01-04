package cn.eamon.study.gp01_simple_factory;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/4 23:21
 */
public class CourseFactory {

    /**
     * 通过if判断创建
     */
    public Course createByIf(String name) {
        if ("math".equals(name)) {
            return new MathCourseImpl();
        } else if ("english".equals(name)) {
            return new EnglishCourseImpl();
        } else {
            return null;
        }
    }

    /**
     * 通过反射创建
     */
    public Course createByReflect(String name) {
        try {
            if (!(null == name || "".equals(name))) {
                return (Course) Class.forName(name).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("创建" + name + "实例失败！");
        }
        return null;
    }

    /**
     * 通过反射+泛型指定创建类型课程
     */
    public Course createByReflectExtends(Class<? extends Course> clazz){
        try{
            if(null!=clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("创建" + clazz + "实例失败！");
        }
        return null;
    }
}
