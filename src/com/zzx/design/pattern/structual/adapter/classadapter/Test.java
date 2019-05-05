package com.zzx.design.pattern.structual.adapter.classadapter;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 17:16
 * Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreateTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();

    }
}
