package cn.eamon.study.gp23_interpreter.normal;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:29
 */
public class NonterminalExpression implements IExpression {
    private IExpression [] expressions;

    public NonterminalExpression(IExpression... expressions) {
        // 每个非终结符表达式都会对其他表达式产生依赖
        this.expressions = expressions;
    }

    public Object interpret(Context context) {
        // 进行文法处理
        context.put("","");
        return null;
    }
}
