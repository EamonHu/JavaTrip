package cn.eamon.study.gp15_template.example;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/16 0:53
 */
public class CookCaiXin extends CookVegetable {
    private boolean needHelp = false;

    public CookCaiXin(boolean needHelp) {
        this.needHelp = needHelp;
    }

    protected boolean needHelp(){
        return this.needHelp;
    }

    @Override
    protected void callHelp() {
        System.out.println("打开下厨房app，看看别人怎么做的");
    }

    @Override
    void pourVegetable() {
        System.out.println("下锅的是菜心");
    }

    @Override
    void pourSauce() {
        System.out.println("下的酱料是蒜蓉");
    }
}
