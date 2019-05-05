package com.zzx.design.pattern.structual.adapter.objectadapter.demo;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 17:48
 * Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
