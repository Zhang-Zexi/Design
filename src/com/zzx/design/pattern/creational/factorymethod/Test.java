package com.zzx.design.pattern.creational.factorymethod;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 14:41
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        VideoFactory video1 = new JavaVideoFactory();
        VideoFactory video2 = new PythonFactory();
        VideoFactory video3 = new FEVideoFactory();
        video1.getVideo();
    }
}
