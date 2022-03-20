package cn.eamon.study.gp15_template.example;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/16 0:52
 */
public class CookBaoCai extends CookVegetable {
    @Override
    protected void callHelp() {
        System.out.println("这活我熟，我自己来");
    }

    @Override
    void pourVegetable() {
        System.out.println("包菜下锅");
    }

    @Override
    void pourSauce() {
        System.out.println("下干辣椒");
    }
}
