package cn.eamon.study.gp02_operation;

import java.util.Queue;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/5 16:37
 */
public class Operation04Consumer implements Runnable {
    private Queue<String> bags;
    private Integer count;

    public Operation04Consumer(Queue<String> bags, Integer count) {
        this.bags = bags;
        this.count = count;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bags) {
                while (bags.size() == 0) {
                    System.out.println("没有包子了");
                    try {
                        bags.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                String bag = bags.remove();
                System.out.println("消费者消费：" + bag);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bags.notifyAll();
            }
        }

    }
}
