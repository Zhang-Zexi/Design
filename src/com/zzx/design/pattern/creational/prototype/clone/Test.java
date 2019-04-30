package com.zzx.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/4/30 16:03
 * Version 1.0
 **/
public class Test  {

    public static void main(String[] args) throws CloneNotSupportedException {

        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 =  (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(666666666666L);

        System.out.println(pig1);
        System.out.println(pig2);

    }
}
