package cn.eamon.study.gp17_chain.builderchain;

import cn.eamon.study.gp17_chain.Member;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 21:13
 */
public class MemberService {
    public void login(String loginName, String loginPass) {
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());

        builder.build().doHandler(new Member(loginName,loginPass));
    }
}
