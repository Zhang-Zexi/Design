package com.zzx.design.pattern.structual.composite;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 11:50
 * Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxComponent = new Course("Linux课程", 11);
        linuxComponent.print();
        CatalogComponent windowsComponent = new Course("Windows课程", 11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录");
        CatalogComponent mmallCourse1 = new Course("Java电商一期", 55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期", 66);
        CatalogComponent designPattern = new Course("Java设计模式", 77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程目录");
        imoocMainCourseCatalog.add(linuxComponent);
        imoocMainCourseCatalog.add(windowsComponent);
        imoocMainCourseCatalog.add(javaCourseCatalog);

//        imoocMainCourseCatalog.print();
    }
}
