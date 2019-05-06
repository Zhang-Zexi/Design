package com.zzx.design.pattern.structual.composite;

/**
 * @ClassName Course
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 11:37
 * Version 1.0
 **/
public class Course extends CatalogComponent {
     private String name;
     private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + name + " Price" + price);
    }
}
