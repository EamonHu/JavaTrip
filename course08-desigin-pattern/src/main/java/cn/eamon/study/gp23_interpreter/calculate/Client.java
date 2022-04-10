package cn.eamon.study.gp23_interpreter.calculate;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:45
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("result: " + new Calculator("41 + 30").calculate());
        System.out.println("result: " + new Calculator("52 + 10 - 50").calculate());
        System.out.println("result: " + new Calculator("100 * 2 + 400 * 1 + 66").calculate());
    }
}
// 输出：
//result: 71
//result: 12
//result: 666