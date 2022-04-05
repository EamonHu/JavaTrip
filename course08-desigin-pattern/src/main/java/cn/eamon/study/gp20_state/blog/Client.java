package cn.eamon.study.gp20_state.blog;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/5 23:56
 */
public class Client {
    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("评论：好文章，360个赞");
    }
}
// 输出：
//跳转到登录页！
//收藏成功！
//评论：好文章，360个赞
