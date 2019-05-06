package com.zzx.design.pattern.structual.bridge;

/**
 * @ClassName ABCBank
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 16:15
 * Version 1.0
 **/
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        return account;
    }


}
