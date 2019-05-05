package com.zzx.design.pattern.structual.facade;

/**
 * @ClassName QualifyService
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 14:56
 * Version 1.0
 **/
public class QualifyService {

    // 资格校验
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + "积分通过，库存通过");
        return true;
    }
}
