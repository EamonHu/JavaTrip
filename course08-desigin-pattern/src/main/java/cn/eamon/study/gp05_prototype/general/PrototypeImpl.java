package cn.eamon.study.gp05_prototype.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/19 0:42
 */
public class PrototypeImpl implements IPrototype<PrototypeImpl> {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeImpl clone() {
        PrototypeImpl prototypeImpl = new PrototypeImpl();
        prototypeImpl.setAge(this.age);
        prototypeImpl.setName(this.name);
        return prototypeImpl;
    }

    @Override
    public String toString() {
        return "prototypeImpl{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
