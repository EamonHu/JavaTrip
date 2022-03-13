package cn.eamon.study.gp14_Delegate.simple;

import java.util.Random;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/13 22:16
 */
public class Delegate implements Task {
    @Override
    public void doTask() {
        System.out.println("代理执行开始...");
        Task task = null;
        if (new Random().nextBoolean()){
            task = new ConcreteA();
        }else{
            task = new ConcreteB();
        }
        task.doTask();

        System.out.println("代理执行完毕....");
    }
}
