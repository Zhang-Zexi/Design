package com.zzx.design.pattern.creational.abstractfactory;

/**
 * @ClassName JavaCourseFactory
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 16:33
 * Version 1.0
 **/
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
