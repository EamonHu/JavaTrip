package cn.eamon.study.gp20_state.blog;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 23:55
 */
public class UnLoginState extends UserState {
    @Override
    public void favorite() {
        this.switch2login();
        this.context.getState().favorite();
    }

    @Override
    public void comment(String comment) {
        this.switch2login();
        this.context.getState().comment(comment);
    }

    private void switch2login(){
        System.out.println("跳转到登录页！");
        this.context.setState(this.context.STATE_LOGIN);
    }
}
