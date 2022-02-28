package cn.eamon.study.gp10_flyweight.ticket;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 14:01
 */
public class Client {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京西", "合肥");
        ticket.showInfo("硬座");
        ticket = TicketFactory.queryTicket("北京西", "合肥");
        ticket.showInfo("软座");
        ticket = TicketFactory.queryTicket("北京西", "合肥");
        ticket.showInfo("硬卧");
    }
}
