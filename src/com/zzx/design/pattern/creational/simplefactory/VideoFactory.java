package com.zzx.design.pattern.creational.simplefactory;

/**
 * @ClassName VideoFactory
 * @Description
 * @Author zhangzx
 * @Date 2019/4/29 14:47
 * Version 1.0
 **/
public class VideoFactory {

    public Video getVideo(Class c) {
        Video video = null;

        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }
}
