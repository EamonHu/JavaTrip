package cn.eamon.study.gp14_Delegate.general;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/13 22:25
 */
public class Client {
    public static void main(String[] args) {
        new Boss().command("海报图", new Leader());
        new Boss().command("爬虫",new Leader());
        new Boss().command("卖手机",new Leader());
    }
}
//员工B-UI，做任务：海报图
//员工A-程序员，做任务：爬虫
//这个任务卖手机超出我的能力范围