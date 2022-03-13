package cn.eamon.study.gp14_Delegate.simple;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/13 22:16
 */
public class ConcreteB implements Task {
    @Override
    public void doTask() {
        System.out.println("执行 , 由B实现");
    }
}
