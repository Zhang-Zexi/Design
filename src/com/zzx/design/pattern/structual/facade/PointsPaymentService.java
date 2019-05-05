package com.zzx.design.pattern.structual.facade;

/**
 * @ClassName PointsPaymentService
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 14:59
 * Version 1.0
 **/
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + "积分成功");
        return true;
    }
}
