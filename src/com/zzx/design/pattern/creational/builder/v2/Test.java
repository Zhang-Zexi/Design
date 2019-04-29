package com.zzx.design.pattern.creational.builder.v2;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 18:03
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().builderCourseName("Java设计模式").buildCoursePPT("Java设计模式PPT" ).build();
        System.out.println(course);
    }
}
