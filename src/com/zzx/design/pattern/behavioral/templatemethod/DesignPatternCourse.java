package com.zzx.design.pattern.behavioral.templatemethod;

/**
 * @ClassName DesignPatternCourse
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 17:23
 * Version 1.0
 **/
public class DesignPatternCourse extends ACourse{
    @Override
    void packageCourse() {
        System.out.println("提供Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
