package com.zzx.design.pattern.creational.abstractfactory;

/**
 * @ClassName PythonVideo
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 16:39
 * Version 1.0
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("学习Python视频");
    }
}
