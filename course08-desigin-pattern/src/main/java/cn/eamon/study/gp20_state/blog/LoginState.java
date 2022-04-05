package cn.eamon.study.gp20_state.blog;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 23:55
 */
public class LoginState extends UserState {
    @Override
    public void favorite() {
        System.out.println("收藏成功！");
    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }
}
