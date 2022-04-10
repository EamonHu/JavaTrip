package cn.eamon.study.gp23_interpreter.calculate;

import cn.eamon.study.gp23_interpreter.calculate.IArithmeticInterpreter;
import cn.eamon.study.gp23_interpreter.calculate.Interpreter;
import cn.eamon.study.gp23_interpreter.calculate.interpreter.AddInterpreter;
import cn.eamon.study.gp23_interpreter.calculate.interpreter.DivInterpreter;
import cn.eamon.study.gp23_interpreter.calculate.interpreter.MultiInterpreter;
import cn.eamon.study.gp23_interpreter.calculate.interpreter.SubInterpreter;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:44
 */
public class OperatorUtil {

    public static boolean isOperator(String symbol) {
        return (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/"));
    }

    public static Interpreter getInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right, String symbol) {
        switch (symbol) {
            case "+":
                return new AddInterpreter(left, right);
            case "-":
                return new SubInterpreter(left, right);
            case "*":
                return new MultiInterpreter(left, right);
            case "/":
                return new DivInterpreter(left, right);
        }
        return null;
    }
}
