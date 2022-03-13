package cn.eamon.study.gp14_Delegate.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/13 21:53
 */
public class Boss {
    public void command(String task, Leader leader){
        leader.doTask(task);
    }
}
