package com.zzx.design.pattern.behavioral.strategy;

import com.sun.deploy.util.StringUtils;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 14:34
 * Version 1.0
 **/
public class Test {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.executePromotion();
//        promotionActivity1111.executePromotion();
//    }

    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
        String promotionKey = "LIJIAN";
//        if (promotionKey.equals("LIJIAN")) {
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        } else if (promotionKey.equals("FANXIAN")) {
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        }
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotion();
    }
}
