package com.zzx.design.pattern.behavioral.strategy;

/**
 * @ClassName ManJianPromotionStrategy
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 14:26
 * Version 1.0
 **/
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200-20元");
    }
}
