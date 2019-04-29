package com.zzx.design.pattern.creational.builder;

/**
 * @ClassName CourseBuilder
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 17:17
 * Version 1.0
 **/
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
