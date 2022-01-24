package cn.eamon.study.gp05_prototype.shallow;

import cn.eamon.study.gp05_prototype.general.IPrototype;
import lombok.Data;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/19 0:42
 */
@Data
public class PrototypeImpl implements Cloneable {
    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    public PrototypeImpl clone() {
        try {
            return (PrototypeImpl)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "PrototypeImpl{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
