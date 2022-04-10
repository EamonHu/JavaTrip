package cn.eamon.study.gp23_interpreter.normal;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:30
 */
public class TerminalExpression implements IExpression {
    private Object value;

    public Object interpret(Context context) {
        // 实现文法中与终结符有关的操作
        context.put("","");
        return null;
    }
}
