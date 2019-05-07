package com.zzx.design.pattern.structual.adapter.objectadapter;


/**
 * @ClassName ConcreateTarget
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 17:10
 * Version 1.0
 **/
public class ConcreateTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreateTarget目标方法");
    }
}
