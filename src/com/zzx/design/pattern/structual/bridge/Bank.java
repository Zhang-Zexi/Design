package com.zzx.design.pattern.structual.bridge;

import com.zzx.design.pattern.creational.prototype.abstractprototype.A;

/**
 * @ClassName Bank
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 16:12
 * Version 1.0
 **/
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
