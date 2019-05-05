package com.zzx.design.pattern.structual.adapter.classadapter;

/**
 * @ClassName Adapter
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 17:12
 * Version 1.0
 **/
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
