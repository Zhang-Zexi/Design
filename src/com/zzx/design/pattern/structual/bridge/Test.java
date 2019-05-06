package com.zzx.design.pattern.structual.bridge;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 16:24
 * Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account account = abcBank.openAccount();
        account.showAccountType();


    }
}
