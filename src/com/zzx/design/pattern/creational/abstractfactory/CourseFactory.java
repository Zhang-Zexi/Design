package com.zzx.design.pattern.creational.abstractfactory;

/**
 * @ClassName CourseFactory
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 16:07
 * Version 1.0
 **/
public interface CourseFactory {

    Video getVideo();
    Article getArticle();
}
