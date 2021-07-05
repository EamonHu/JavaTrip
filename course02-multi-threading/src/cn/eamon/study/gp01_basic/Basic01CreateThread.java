package cn.eamon.study.gp01_basic;

import java.util.concurrent.*;

/**
 * @Author: Eamon
 * @Description: 三种方式创建线程
 * @Date: 2021/7/5 10:37
 */
public class Basic01CreateThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 继承Thread类型
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        //实现Runnable接口
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
        // 实现Callable接口
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<?> future = executorService.submit(new CallableDemo());
        System.out.println(Thread.currentThread().getName() + "返回值->" + future.get());
    }

    /**
     * 继承Thread类实现线程
     */
    public static class ThreadDemo extends Thread {
        @Override
        public void run() {
            System.out.println("继承Thread当前线程：" + Thread.currentThread().getName());
        }
    }

    /**
     * 实现Runnable接口实现线程
     */
    public static class RunnableDemo implements Runnable {

        @Override
        public void run() {
            System.out.println("实现Runnable接口当前线程：" + Thread.currentThread().getName());
        }
    }

    /**
     * 实现Callable接口
     */
    public static class CallableDemo implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("实现Callable接口当前线程：" + Thread.currentThread().getName());
            Thread.sleep(1000);
            return "Callable线程结束";
        }
    }
}
