package com.zzx.design.pattern.structual.bridge;

/**
 * @ClassName SavingAccount
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 16:10
 * Version 1.0
 **/
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");

    }
}
