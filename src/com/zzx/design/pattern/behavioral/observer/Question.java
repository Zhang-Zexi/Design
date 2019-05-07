package com.zzx.design.pattern.behavioral.observer;

/**
 * @ClassName Question
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 16:09
 * Version 1.0
 **/
public class Question {
    private String userName;
    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
