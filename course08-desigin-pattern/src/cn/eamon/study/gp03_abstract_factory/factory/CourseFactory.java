package cn.eamon.study.gp03_abstract_factory.factory;

import cn.eamon.study.gp03_abstract_factory.IAnswer;
import cn.eamon.study.gp03_abstract_factory.INote;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/5 0:17
 */
public abstract class CourseFactory {
    public void init(){
        System.out.println("初始化参数");
    }

    /**
     * 创建笔记
     */
    public abstract INote createNote();

    /**
     * 回答问题
     */
    public abstract IAnswer createAnswer();
}
