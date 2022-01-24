package cn.eamon.study.gp05_prototype.general;

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
        System.out.println(prototype);

        //拷贝原型对象
        PrototypeImpl cloneType = prototype.clone();
        System.out.println(cloneType);
    }

}
