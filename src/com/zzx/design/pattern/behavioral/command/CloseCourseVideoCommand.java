package com.zzx.design.pattern.behavioral.command;

/**
 * @ClassName CloseCourseVideoCommand
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 17:26
 * Version 1.0
 **/
public class CloseCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
