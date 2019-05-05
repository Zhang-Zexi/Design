package com.zzx.design.pattern.structual.facade;

/**
 * @ClassName GiftExchangeService
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 15:04
 * Version 1.0
 **/
public class GiftExchangeService {

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private ShippingService shippingService = new ShippingService();

    private QualifyService qualifyService = new QualifyService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                String  shippingOrderNo= shippingService.shipGift(pointsGift);
                System.out.println("物流下单成功，订单号为：" + shippingOrderNo);
            }
        }
    }
 }
