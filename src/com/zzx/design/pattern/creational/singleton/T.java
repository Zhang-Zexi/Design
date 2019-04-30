package com.zzx.design.pattern.creational.singleton;

/**
 * @ClassName T
 * @Description
 * @Author zhangzx
 * @Date 2019/4/30 11:21
 * Version 1.0
 **/
public class T implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "" + instance);
    }
}
