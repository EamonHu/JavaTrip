package cn.eamon.study.gp03_abstract_factory.noteImpl;

import cn.eamon.study.gp03_abstract_factory.INote;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/5 0:16
 */
public class EnglishNoteImpl implements INote {
    @Override
    public void edit() {
        System.out.println("写英语笔记");
    }
}
