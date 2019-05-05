package com.zzx.design.pattern.structual.decorator.v1;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 15:56
 * Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + " 价格" + batterCake.cost());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + " 价格" + batterCakeWithEgg.cost());

        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + " 价格" + batterCakeWithEggSausage.cost());
    }
}
