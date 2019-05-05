package com.zzx.design.pattern.structual.decorator.v2;

/**
 * @ClassName EggDecorator
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 16:18
 * Version 1.0
 **/
public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
