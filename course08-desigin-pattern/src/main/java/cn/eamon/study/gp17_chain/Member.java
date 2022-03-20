package cn.eamon.study.gp17_chain;

import lombok.Data;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 21:03
 */
@Data
public class Member {
    private String loginName;
    private String loginPass;
    private String roleName;

    public Member(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }

    public Member(String loginName, String loginPass, String roleName) {
        this.loginName = loginName;
        this.loginPass = loginPass;
        this.roleName = roleName;
    }
}
