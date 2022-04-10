package cn.eamon.study.gp23_interpreter.calculate;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:37
 */
public abstract class Interpreter implements IArithmeticInterpreter {
    protected IArithmeticInterpreter left;
    protected IArithmeticInterpreter right;

    public Interpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        this.left = left;
        this.right = right;
    }
}
