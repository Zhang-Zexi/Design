package com.zzx.design.pattern.creational.builder;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 17:43
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式", "Java设计模式PPT",
                "Java设计模式视频", "Java设计模式手记", "Java设计模式问题&回答");

        System.out.println(course);
    }
}
