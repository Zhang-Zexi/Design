package com.zzx.design.pattern.structual.adapter.objectadapter;

/**
 * @ClassName Adapter
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 17:35
 * Version 1.0
 **/
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
