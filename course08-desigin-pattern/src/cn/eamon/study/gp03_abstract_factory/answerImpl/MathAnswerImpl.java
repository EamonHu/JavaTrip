package cn.eamon.study.gp03_abstract_factory.answerImpl;

import cn.eamon.study.gp03_abstract_factory.IAnswer;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/5 0:15
 */
public class MathAnswerImpl implements IAnswer {
    @Override
    public void speak() {
        System.out.println("回答数学问题");
    }
}
