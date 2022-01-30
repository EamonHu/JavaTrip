package cn.eamon.study.gp06_builder.simple;

import lombok.Data;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/30 15:33
 */
@Data
public class Course {

    private String name;

    private String ppt;

    private String video;

    private String note;

    private String homework;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", note='" + note + '\'' +
                ", homework='" + homework + '\'' +
                '}';
    }

}
