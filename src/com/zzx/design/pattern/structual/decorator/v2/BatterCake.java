package com.zzx.design.pattern.structual.decorator.v2;

/**
 * @ClassName BatterCake
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 16:01
 * Version 1.0
 **/
public class BatterCake extends ABatterCake {
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
