package com.zzx.design.pattern.creational.prototype.abstractprototype;

/**
 * @ClassName A
 * @Description
 * @Author zhangzx
 * @Date 2019/4/30 15:57
 * Version 1.0
 **/
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
