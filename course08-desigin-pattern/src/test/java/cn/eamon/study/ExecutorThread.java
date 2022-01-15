package cn.eamon.study;

import cn.eamon.study.gp04_singleton.lazy.LazySimpleSingleton;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/1/13 0:14
 */
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
