package com.zzx.design.pattern.behavioral.command;

/**
 * @ClassName CourseVideo
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 17:23
 * Version 1.0
 **/
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "课程视频开放");
    }

    public void close() {
        System.out.println(this.name + "课程视频关闭");
    }

}
