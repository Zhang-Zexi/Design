package com.zzx.design.pattern.creational.simplefactory;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 14:41
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
//        Video video = new PythonVideo();
//        video.produce();

//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
