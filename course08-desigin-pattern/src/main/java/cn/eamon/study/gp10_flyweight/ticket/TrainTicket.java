package cn.eamon.study.gp10_flyweight.ticket;

import java.util.Random;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 13:57
 */
public class TrainTicket implements ITicket {
    private String fromAddr;
    private String toAddr;
    private double price;

    public TrainTicket(String fromAdd, String toAdd) {
        this.fromAddr = fromAdd;
        this.toAddr = toAdd;
    }

    @Override
    public void showInfo(String bunk) {
        // 票价随机生成
        this.price = new Random().nextInt(500);
        System.out.printf("%s->%s：%s价格：%s 元%n", this.fromAddr, this.toAddr, bunk, this.price);
    }
}
