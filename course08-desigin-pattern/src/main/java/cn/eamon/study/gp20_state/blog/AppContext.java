package cn.eamon.study.gp20_state.blog;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 23:54
 */
public class AppContext {

    public static final UserState STATE_LOGIN = new LoginState();
    public static final UserState STATE_UNLOGIN = new UnLoginState();

    private UserState currentState = STATE_UNLOGIN;

    {
        STATE_LOGIN.setContext(this);
        STATE_UNLOGIN.setContext(this);
    }

    public void setState(UserState state){
        this.currentState = state;
    }

    public UserState getState(){
        return this.currentState;
    }

    public void favorite(){
        this.currentState.favorite();
    }

    public void comment(String comment){
        this.currentState.comment(comment);
    }
}
