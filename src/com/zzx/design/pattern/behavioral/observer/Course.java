package com.zzx.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @ClassName Course
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 16:08
 * Version 1.0
 **/
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.courseName + "提出了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
