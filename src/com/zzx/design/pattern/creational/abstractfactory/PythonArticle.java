package com.zzx.design.pattern.creational.abstractfactory;

/**
 * @ClassName PythonArticle
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 16:39
 * Version 1.0
 **/
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("制作Python手记");
    }
}
