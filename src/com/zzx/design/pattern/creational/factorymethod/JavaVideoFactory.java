package com.zzx.design.pattern.creational.factorymethod;

/**
 * @ClassName JavaVideoFactory
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 15:35
 * Version 1.0
 **/
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
