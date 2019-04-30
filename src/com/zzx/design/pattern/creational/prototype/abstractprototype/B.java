package com.zzx.design.pattern.creational.prototype.abstractprototype;

/**
 * @ClassName B
 * @Description
 * @Author zhangzx
 * @Date 2019/4/30 15:58
 * Version 1.0
 **/
public class B extends A {

    // B可以使用A中的克隆方法
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }
}
