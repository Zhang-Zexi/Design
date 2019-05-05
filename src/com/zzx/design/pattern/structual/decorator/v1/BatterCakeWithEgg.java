package com.zzx.design.pattern.structual.decorator.v1;

/**
 * @ClassName BatterCakeWithEgg
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 15:40
 * Version 1.0
 **/
public class BatterCakeWithEgg extends  BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
