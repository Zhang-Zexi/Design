package com.zzx.design.pattern.structual.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName EmployeeFactory
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 9:52
 * Version 1.0
 **/
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    public static Employee getManager(String         department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建部门经理：" + department);
            String reportContent = department + "部分汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println("创建报告：" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
