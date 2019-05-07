package com.zzx.design.pattern.behavioral.command;

/**
 * @ClassName OpenCourseVideoCommand
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 17:25
 * Version 1.0
 **/
public class OpenCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
