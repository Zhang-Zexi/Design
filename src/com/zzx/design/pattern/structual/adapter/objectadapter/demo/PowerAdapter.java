package com.zzx.design.pattern.structual.adapter.objectadapter.demo;

/**
 * @ClassName PowerAdapter
 * @Description
 * @Author zhangzx
 * @Date 2019/5/5 17:44
 * Version 1.0
 **/
public class PowerAdapter implements DC5{
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();

        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC：" + adapterInput + "V" + " 输出DV" + adapterOutput + "V");
        return adapterOutput;
    }
}
