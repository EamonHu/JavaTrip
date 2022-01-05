package cn.eamon.study.gp03_abstract_factory.factory;

import cn.eamon.study.gp03_abstract_factory.IAnswer;
import cn.eamon.study.gp03_abstract_factory.INote;
import cn.eamon.study.gp03_abstract_factory.answerImpl.EnglishAnswerImpl;
import cn.eamon.study.gp03_abstract_factory.answerImpl.MathAnswerImpl;
import cn.eamon.study.gp03_abstract_factory.noteImpl.MathNoteImpl;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/5 0:19
 */
public class MathCourseFactory extends CourseFactory {
    @Override
    public INote createNote() {
        super.init();
        return new MathNoteImpl();
    }

    @Override
    public IAnswer createAnswer() {
        return new MathAnswerImpl();
    }
}
