package com.zzx.design.pattern.structual.flyweight;

/**
 * @ClassName Manager
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 9:49
 * Version 1.0
 **/
public class Manager implements Employee {
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
