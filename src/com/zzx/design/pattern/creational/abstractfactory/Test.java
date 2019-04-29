package com.zzx.design.pattern.creational.abstractfactory;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 16:43
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video  = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
