package com.zzx.design.pattern.structual.bridge;

import com.zzx.design.pattern.creational.prototype.abstractprototype.B;

/**
 * @ClassName ICBCBank
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 16:17
 * Version 1.0
 **/
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        // 委托
        account.openAccount();
        return account;
    }
}
