package cn.eamon.study.gp20_state.general;

import cn.eamon.study.gp16_strategy.general.IStrategy;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 23:47
 */
public class ConcreteStateA implements IState {
    @Override
    public void handle() {
        //必要时刻需要进行状态切换
        System.out.println("StateA do action");
    }
}
