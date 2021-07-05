package cn.eamon.study.gp02_operation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/7/5 16:38
 */
public class Operation05WaitNotifyMain {
    public static void main(String[] args) {
        Queue<String> bags = new LinkedList<>();
        Integer count = 10;
        Operation03Producer producer = new Operation03Producer(count, bags);
        Operation04Consumer consumer = new Operation04Consumer(bags, count);
        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);
        threadProducer.start();
        threadConsumer.start();
    }
}
