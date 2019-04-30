package com.zzx.design.pattern.creational.singleton;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/4/30 11:19
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
