package cn.eamon.study.gp20_state.blog;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 23:54
 */
public abstract class UserState {
    protected AppContext context;

    public void setContext(AppContext context) {
        this.context = context;
    }

    public abstract void favorite();

    public abstract void comment(String comment);
}
