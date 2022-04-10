package cn.eamon.study.gp23_interpreter.normal;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:28
 */
public interface IExpression {
    // 对表达式进行解释
    Object interpret(Context context);
}
