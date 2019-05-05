package com.zzx.design.pattern.structual.decorator.v1;

/**
 * @ClassName BatterCakeWithEggSausage
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 15:54
 * Version 1.0
 **/
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
