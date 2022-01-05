package cn.eamon.study.gp03_abstract_factory.factory;

import cn.eamon.study.gp03_abstract_factory.IAnswer;
import cn.eamon.study.gp03_abstract_factory.INote;
import cn.eamon.study.gp03_abstract_factory.answerImpl.EnglishAnswerImpl;
import cn.eamon.study.gp03_abstract_factory.noteImpl.EnglishNoteImpl;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/5 0:19
 */
public class EnglishCourseFactory extends CourseFactory {
    @Override
    public INote createNote() {
        return new EnglishNoteImpl();
    }

    @Override
    public IAnswer createAnswer() {
        return new EnglishAnswerImpl();
    }
}
