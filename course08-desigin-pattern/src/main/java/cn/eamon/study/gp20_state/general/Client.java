package cn.eamon.study.gp20_state.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 23:48
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateB());
        context.handle();
    }
}
