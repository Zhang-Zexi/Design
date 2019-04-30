package com.zzx.design.pattern.creational.prototype;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/4/30 15:28
 * Version 1.0
 **/
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:" + mail);
        for (int i = 0; i < 10; i ++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名:" + i);
            mailTemp.setEmailAddress("姓名:" + i + "@imooc.com");
            mailTemp.setContent("恭喜慕课活动中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:" + mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
