package cn.eamon.study.gp23_interpreter.calculate.interpreter;

import cn.eamon.study.gp23_interpreter.calculate.IArithmeticInterpreter;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:42
 */
public class NumInterpreter implements IArithmeticInterpreter {
    private int value;

    public NumInterpreter(int value) {
        this.value = value;
    }


    public int interpret() {
        return this.value;
    }
}
