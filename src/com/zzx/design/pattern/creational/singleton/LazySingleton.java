package com.zzx.design.pattern.creational.singleton;

/**
 * @ClassName LazySingleton
 * @Description
 * @Author zhangzx
 * @Date 2019/4/30 11:15
 * Version 1.0
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    // 构造器private，不让外部进行加载
    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


}
