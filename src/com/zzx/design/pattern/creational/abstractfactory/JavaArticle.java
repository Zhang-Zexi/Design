package com.zzx.design.pattern.creational.abstractfactory;

/**
 * @ClassName JavaArticle
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 16:32
 * Version 1.0
 **/
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("制作Java手记");
    }
}
