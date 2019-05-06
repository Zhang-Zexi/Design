package com.zzx.design.pattern.behavioral.templatemethod;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 17:25
 * Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start------");
        ACourse aCourse = new DesignPatternCourse();
        aCourse.makeCourse();
        System.out.println("后端设计模式课程end------");

        System.out.println("前端设计模式课程start------");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端设计模式课程end------");

    }
}
