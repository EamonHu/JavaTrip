package cn.eamon.study.gp20_state.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 23:48
 */
public class ConcreteStateB implements IState {
    @Override
    public void handle() {
        //必要时刻需要进行状态切换
        System.out.println("StateB do action");
    }
}
