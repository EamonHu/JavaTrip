package cn.eamon.study.gp17_chain.chain;

import cn.eamon.study.gp17_chain.Member;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/3/20 21:09
 */
public abstract class Handler {
    protected Handler next;

    public void next(Handler next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);
}
