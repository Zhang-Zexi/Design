package com.zzx.design.pattern.behavioral.strategy;

/**
 * @ClassName EmptyPromotionStrategy
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 15:09
 * Version 1.0
 **/
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
