package cn.eamon.study.gp21_memento.editor;

import java.util.Stack;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/4/6 22:36
 */
public class DraftsBox {
    private final Stack<ArticleMemento> STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento) {
        STACK.push(articleMemento);
    }
}
