package cn.eamon.study.gp08_facade;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 21:23
 */
public class ShippingService {

    public String delivery(GifInfo git) {
        System.out.println(git.getName() + "进入物流系统");
        String shippingNo = "666";
        return shippingNo;
    }
}
