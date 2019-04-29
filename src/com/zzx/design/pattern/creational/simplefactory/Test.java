package com.zzx.design.pattern.creational.simplefactory;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 14:41
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Video video = new PythonVideo();
        video.produce();
    }
}
