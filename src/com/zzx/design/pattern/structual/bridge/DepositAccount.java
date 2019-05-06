package com.zzx.design.pattern.structual.bridge;

/**
 * @ClassName DepositAccount
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 16:09
 * Version 1.0
 **/
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
