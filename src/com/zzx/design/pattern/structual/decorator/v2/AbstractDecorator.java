package com.zzx.design.pattern.structual.decorator.v2;

/**
 * @ClassName AbstractDecorator
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 16:03
 * Version 1.0
 **/
public class AbstractDecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    public String getDesc() {
        return aBatterCake.getDesc();
    }

    @Override
    public int cost() {
        return aBatterCake.cost();
    }
}
