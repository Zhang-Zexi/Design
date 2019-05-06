package com.zzx.design.pattern.behavioral.templatemethod;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @ClassName ACourse
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 17:18
 * Version 1.0
 **/
public abstract class ACourse {
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    // 钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();

}
