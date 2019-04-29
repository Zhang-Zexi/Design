package com.zzx.design.pattern.creational.abstractfactory;

/**
 * @ClassName PythonCourseFactory
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 16:40
 * Version 1.0
 **/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
