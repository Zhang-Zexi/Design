package com.zzx.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @ClassName MailUtil
 * @Description
 * @Author zhangzx
 * @Date 2019/4/30 15:20
 * Version 1.0
 **/
public class MailUtil {

    public static void sendMail(Mail mail) {
        String outPutContent = "向{0}同学,邮箱地址:{1},邮件内容:{2}发送邮件成功";
        System.out.println(MessageFormat.format(outPutContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }
    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail, orginMail:" + mail.getContent());
    }
}
