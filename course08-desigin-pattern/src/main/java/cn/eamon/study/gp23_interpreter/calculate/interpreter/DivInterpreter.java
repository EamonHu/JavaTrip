package cn.eamon.study.gp23_interpreter.calculate.interpreter;

import cn.eamon.study.gp23_interpreter.calculate.IArithmeticInterpreter;
import cn.eamon.study.gp23_interpreter.calculate.Interpreter;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:40
 */
public class DivInterpreter extends Interpreter {
    public DivInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right){
        super(left,right);
    }

    public int interpret() {
        return this.left.interpret() / this.right.interpret();
    }
}
