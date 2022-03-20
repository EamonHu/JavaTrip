package cn.eamon.study.gp17_chain.builderchain;

import cn.eamon.study.gp17_chain.Member;

import java.util.Objects;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 21:11
 */
public class ValidateHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if (Objects.isNull(member.getLoginName()) ||
                Objects.isNull(member.getLoginPass())) {
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        next.doHandler(member);
    }
}
