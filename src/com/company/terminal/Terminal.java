package com.company.terminal;

import com.company.account.Account;

public interface Terminal {
    public double checkBalance(Account account);
    public double takeOff(Account account);
    public void putInto(Account account);
}
