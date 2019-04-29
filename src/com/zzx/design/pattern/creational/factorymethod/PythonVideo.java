package com.zzx.design.pattern.creational.factorymethod;

/**
 * @ClassName PythonVideo
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 14:40
 * Version 1.0
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
