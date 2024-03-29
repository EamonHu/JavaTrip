package cn.eamon.study.gp04_JUC;

import java.util.concurrent.CyclicBarrier;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/24 14:43
 */
public class Juc03CyclicBarrier extends Thread {
    @Override
    public void run() {
        System.out.println("开始进行数据汇总和分析");
    }

    /**
     * 1. parties ,如果因为某种原因导致没有足够多的线程来调用await，
     * 这个时候会导致所有线程都会被阻塞
     * 2. await(timeout,unit) 设置一个超市等待时间.
     * 3. reset重置计数，brokenBarrierException
     * @param args
     */

    public static void main(String[] args) {
        //parties=3
        CyclicBarrier cyclicBarrier=
                new CyclicBarrier(3,new Juc03CyclicBarrier());
        new DataImportThread("path1",cyclicBarrier).start();
        new DataImportThread("path2",cyclicBarrier).start();
        new DataImportThread("path3",cyclicBarrier).start();
        //TODO 希望三个线程执行结束之后，再做一个汇总处理.
    }
}
