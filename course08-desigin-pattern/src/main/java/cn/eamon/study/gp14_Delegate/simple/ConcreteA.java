package cn.eamon.study.gp14_Delegate.simple;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/13 22:15
 */
public class ConcreteA implements Task {
    @Override
    public void doTask() {
        System.out.println("执行 , 由A实现");
    }
}
