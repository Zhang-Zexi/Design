package com.zzx.design.pattern.structual.decorator.v2;

/**
 * @ClassName SausageDecorator
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 16:05
 * Version 1.0
 **/
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }

}
