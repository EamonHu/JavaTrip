package cn.eamon.study.gp15_template.example;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/16 0:55
 */
public class Client {
    public static void main(String[] args) {
        CookBaoCai baoCai = new CookBaoCai();
        baoCai.cookProcess();
        System.out.println("===========");
        CookCaiXin caiXin = new CookCaiXin(true);
        caiXin.cookProcess();
    }
}

// 输出：
// 倒油
// 热油
// 包菜下锅
// 下干辣椒
// 炒啊炒啊炒到熟啊
// ===========
// 打开下厨房app，看看别人怎么做的
// 倒油
// 热油
// 下锅的是菜心
// 下的酱料是蒜蓉
// 炒啊炒啊炒到熟啊

