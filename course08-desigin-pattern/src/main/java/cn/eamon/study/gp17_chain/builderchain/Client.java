package cn.eamon.study.gp17_chain.builderchain;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 21:13
 */
public class Client {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("tom", "666");
    }
}
