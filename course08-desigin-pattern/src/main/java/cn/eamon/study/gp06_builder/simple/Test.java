package cn.eamon.study.gp06_builder.simple;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/30 15:39
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder()
                .addName("设计模式").addPpt("wiki上的链接")
                .addNote("Eamon的笔记");
        System.out.println(builder.builder());
    }
}
