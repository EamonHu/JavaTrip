package cn.eamon.study.gp08_facade;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 21:25
 */
public class Client {

    public static void main(String[] args) {
        QualifyService qualifyService = new QualifyService();
        PaymentService paymentService = new PaymentService();
        ShippingService shippingService = new ShippingService();

        GifInfo gifInfo = new GifInfo("《设计模式精讲》");

        if (qualifyService.isAvailable(gifInfo)) {
            if (paymentService.pay(gifInfo)) {
                String delivery = shippingService.delivery(gifInfo);
                System.out.println("物流系统下单成功，物流单号是：" + delivery);
            }
        }

        FacadeService facadeService = new FacadeService();
        facadeService.exchange(gifInfo);
    }
}
