package com.zzx.design.pattern.behavioral.templatemethod;

/**
 * @ClassName FECourse
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 17:24
 * Version 1.0
 **/
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
