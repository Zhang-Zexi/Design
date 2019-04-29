package com.zzx.design.pattern.creational.factorymethod;

/**
 * @ClassName FEVideo
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 15:43
 * Version 1.0
 **/
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
