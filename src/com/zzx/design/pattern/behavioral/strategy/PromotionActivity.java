package com.zzx.design.pattern.behavioral.strategy;

/**
 * @ClassName PromotionActivity
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 14:31
 * Version 1.0
 **/
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotion() {
        promotionStrategy.doPromotion();
    }
}
