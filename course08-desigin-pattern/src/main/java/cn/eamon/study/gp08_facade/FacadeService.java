package cn.eamon.study.gp08_facade;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2022/2/13 22:15
 */
public class FacadeService {

    QualifyService qualifyService = new QualifyService();
    PaymentService paymentService = new PaymentService();
    ShippingService shippingService = new ShippingService();

    public void exchange(GifInfo gifInfo){
        if (qualifyService.isAvailable(gifInfo)) {
            if (paymentService.pay(gifInfo)) {
                String delivery = shippingService.delivery(gifInfo);
                System.out.println("物流系统下单成功，物流单号是：" + delivery);
            }
        }
    }
}
