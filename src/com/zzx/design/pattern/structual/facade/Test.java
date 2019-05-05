package com.zzx.design.pattern.structual.facade;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 15:13
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        PointsGift pointsGift = new PointsGift("T-shirt");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

//        giftExchangeService.setQualifyService(new QualifyService());
//        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
//        giftExchangeService.setShippingService(new ShippingService());

        giftExchangeService.giftExchange(pointsGift);

    }

}
