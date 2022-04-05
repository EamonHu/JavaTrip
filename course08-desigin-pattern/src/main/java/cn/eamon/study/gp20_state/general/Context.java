package cn.eamon.study.gp20_state.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 23:48
 */
public class Context {
    private static final IState STATE_A = new ConcreteStateA();
    private static final IState STATE_B = new ConcreteStateB();
    //默认状态A
    private IState currentState = STATE_A;

    public void setState(IState state) {
        this.currentState = state;
    }

    public void handle() {
        this.currentState.handle();
    }
}
