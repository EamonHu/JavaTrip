package cn.eamon.study.gp05_prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/19 0:44
 */
public class Client {
    public static void main(String[] args) {
        //创建原型对象
        PrototypeImpl prototype = new PrototypeImpl();
        prototype.setAge(18);
        prototype.setName("Tom");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("编程");
        hobbies.add("看书");
        prototype.setHobbies(hobbies);

        //拷贝原型对象
        PrototypeImpl cloneType = prototype.clone();
        cloneType.getHobbies().add("加班");
        System.out.println("原型对象" + prototype);
        System.out.println("克隆对象" + cloneType);
        System.out.println(cloneType == prototype);

        System.out.println(prototype.getHobbies() == cloneType.getHobbies());
    }

}
