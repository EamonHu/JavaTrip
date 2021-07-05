package cn.eamon.study.gp02_operation;

import java.util.List;
import java.util.Queue;

/**
 * @Author: Eamon
 * @Description:生产者
 * @Date: 2021/7/5 16:37
 */
public class Operation03Producer implements Runnable {

    private Integer count;
    private Queue<String> bags;

    public Operation03Producer(Integer count, Queue<String> bags) {
        this.count = count;
        this.bags = bags;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            synchronized (bags) {
                while (count == bags.size()) {
                    System.out.println("生产满了");
                    try {
                        bags.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("生产者-生产bags" + i);
                bags.add("bags" + i);
                bags.notifyAll();
            }
        }
    }
}
