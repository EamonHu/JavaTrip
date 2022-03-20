package cn.eamon.study.gp17_chain.chain;

import cn.eamon.study.gp17_chain.Member;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 21:13
 */
public class MemberService {
    public void login(String loginName, String loginPass) {
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validateHandler.doHandler(new Member(loginName, loginPass));

    }
}
