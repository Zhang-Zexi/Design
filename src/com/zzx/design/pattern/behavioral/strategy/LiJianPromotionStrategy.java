package com.zzx.design.pattern.behavioral.strategy;

/**
 * @ClassName LiJianPromotionStrategy
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 14:26
 * Version 1.0
 **/
public class LiJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程的价格立减促销的价格");
    }
}
