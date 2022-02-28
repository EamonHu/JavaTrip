package cn.eamon.study.gp10_flyweight.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/20 14:00
 */
public class TicketFactory {

    private static final Map<String, ITicket> ticketPool = new ConcurrentHashMap<String, ITicket>();

    public static ITicket queryTicket(String from, String to) {
        String key = from + "->" + to;
        if (TicketFactory.ticketPool.containsKey(key)) {
            System.out.println("使用缓存：" + key);
            return TicketFactory.ticketPool.get(key);
        }
        System.out.println("首次查询，创建对象: " + key);
        ITicket ticket = new TrainTicket(from, to);
        TicketFactory.ticketPool.put(key, ticket);
        return ticket;
    }
}
