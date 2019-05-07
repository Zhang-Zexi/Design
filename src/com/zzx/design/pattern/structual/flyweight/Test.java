package com.zzx.design.pattern.structual.flyweight;

import com.zzx.design.pattern.creational.prototype.Mail;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 10:00
 * Version 1.0
 **/
public class Test {
    private static final String departments[] = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++) {
            String deparment = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(deparment);
            manager.report();
        }

    }
}
