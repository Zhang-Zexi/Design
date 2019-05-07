package com.zzx.design.pattern.behavioral.strategy;

/**
 * @ClassName FanXianPromotionStrategy
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 14:27
 * Version 1.0
 **/
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到慕课网用户的余额中");
    }
}
