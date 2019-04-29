package com.zzx.design.pattern.creational.factorymethod;

/**
 * @ClassName JavaVideo
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 14:39
 * Version 1.0
 **/
    public class JavaVideo extends Video {
        @Override
        public void produce() {
            System.out.println("录制Java课程视频");
        }
    }
