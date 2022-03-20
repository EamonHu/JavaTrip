package cn.eamon.study.gp17_chain.old;

import cn.eamon.study.gp17_chain.Member;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Objects;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 21:03
 */
public class MemberService {
    public void login(String loginName, String loginPass) {
        if (Objects.isNull(loginName) ||
                Objects.isNull(loginPass)) {
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");

        Member member = checkExists(loginName, loginPass);
        if (null == member) {
            System.out.println("用户不存在");
            return;
        }
        System.out.println("登录成功！");

        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("允许操作");

    }

    private Member checkExists(String loginName, String loginPass) {
        Member member = new Member(loginName, loginPass);
        member.setRoleName("管理员");
        return member;
    }

    public static void main(String[] args) {
        MemberService service = new MemberService();
        service.login("tom", "666");
    }
}
