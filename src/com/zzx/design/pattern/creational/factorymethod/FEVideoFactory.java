package com.zzx.design.pattern.creational.factorymethod;

/**
 * @ClassName FEVideoFactory
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 15:44
 * Version 1.0
 **/
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
