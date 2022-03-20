package cn.eamon.study.gp17_chain.builderchain;

import cn.eamon.study.gp17_chain.Member;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 21:10
 */
public class LoginHandler extends Handler {

    public void doHandler(Member member) {
        System.out.println("登录成功！");
        next.doHandler(member);
    }
}

//用户名和密码不为空，可以往下执行
//登录成功！
//您不是管理员，没有操作权限