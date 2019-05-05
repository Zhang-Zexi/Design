package com.zzx.design.pattern.structual.decorator.v2;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 16:21
 * Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ABatterCake abatterCake;
        abatterCake = new BatterCake();
        abatterCake = new EggDecorator(abatterCake);
        abatterCake = new EggDecorator(abatterCake);
        abatterCake = new SausageDecorator(abatterCake);

        System.out.println(abatterCake.getDesc() + " 价格" + abatterCake.cost());
    }
}
