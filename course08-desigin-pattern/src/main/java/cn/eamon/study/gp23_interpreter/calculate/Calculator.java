package cn.eamon.study.gp23_interpreter.calculate;

import cn.eamon.study.gp23_interpreter.calculate.IArithmeticInterpreter;
import cn.eamon.study.gp23_interpreter.calculate.interpreter.NumInterpreter;

import java.util.Stack;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/10 21:42
 */
public class Calculator {
    private Stack<IArithmeticInterpreter> stack = new Stack<IArithmeticInterpreter>();

    public Calculator(String expression) {
        this.parse(expression);
    }

    private void parse(String expression) {
        String [] elements = expression.split(" ");
        IArithmeticInterpreter leftExpr, rightExpr;

        for (int i = 0; i < elements.length ; i++) {
            String operator = elements[i];
            if (OperatorUtil.isOperator(operator)){
                leftExpr = this.stack.pop();
                rightExpr = new NumInterpreter(Integer.parseInt(elements[++i]));
//                System.out.println("出栈: " + leftExpr.interpret() + " 和 " + rightExpr.interpret());
                this.stack.push(OperatorUtil.getInterpreter(leftExpr, rightExpr,operator));
//                System.out.println("应用运算符: " + operator);
            } else{
                NumInterpreter numInterpreter = new NumInterpreter(Integer.parseInt(elements[i]));
                this.stack.push(numInterpreter);
//                System.out.println("入栈: " + numInterpreter.interpret());
            }
        }
    }

    public int calculate() {
        return this.stack.pop().interpret();
    }
}
