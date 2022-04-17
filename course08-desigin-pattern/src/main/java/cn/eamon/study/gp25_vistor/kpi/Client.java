package cn.eamon.study.gp25_vistor.kpi;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/17 16:28
 */
public class Client {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("==========CEO看报表===============");
        report.showReport(new CEOVisitor());
        System.out.println("==========CTO看报表===============");
        report.showReport(new CTOVisitor());
    }
}
// 输出：
//==========CEO看报表===============
//经理：产品经理A,KPI:1，产品数量：8
//工程师程序员A，KIP：2
//工程师程序员B，KIP：0
//工程师程序员C，KIP：3
//经理：产品经理B,KPI:8，产品数量：4
//工程师程序员D，KIP：0
//==========CTO看报表===============
//经理：产品经理A，产品数量：8
//工程师程序员A，代码行数：97543
//工程师程序员B，代码行数：88979
//工程师程序员C，代码行数：34892
//经理：产品经理B，产品数量：3
//工程师程序员D，代码行数：22817