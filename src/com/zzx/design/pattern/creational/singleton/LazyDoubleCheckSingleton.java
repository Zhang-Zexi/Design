package com.zzx.design.pattern.creational.singleton;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Description
 * @Author zhangzx
 * @Date 2019/4/30 11:37
 * Version 1.0
 **/
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    // 构造器private，不让外部进行加载
    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();

                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
