package com.zzx.design.pattern.creational.factorymethod;

/**
 * @ClassName PythonFactory
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 15:36
 * Version 1.0
 **/
public class PythonFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
