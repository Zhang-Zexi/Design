package com.zzx.design.pattern.creational.abstractfactory;

import com.zzx.design.pattern.creational.factorymethod.VideoFactory;

/**
 * @ClassName JavaVideo
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 16:31
 * Version 1.0
 **/
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("学习Java课程");
    }
}
