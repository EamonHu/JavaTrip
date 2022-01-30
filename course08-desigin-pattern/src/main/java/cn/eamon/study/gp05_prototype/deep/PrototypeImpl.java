package cn.eamon.study.gp05_prototype.deep;

import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/19 0:42
 */
@Data
public class PrototypeImpl implements Cloneable, Serializable {
    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    public PrototypeImpl clone() {
        try {
            return (PrototypeImpl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PrototypeImpl deepClone() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (PrototypeImpl) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
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
