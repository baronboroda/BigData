package com.zelenin.labs.lab_7_BankCredit;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;

public class Bank {

    private String name;
    private String address;
    private HashSet<CreditType> types;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
        this.types = new HashSet<>();
    }

    public void addType(CreditType type) {
        types.add(type);
    }

    public void removeType(CreditType type) {
        types.remove(type);
    }

    public void openCredit(Bank bank, CreditType type, BigDecimal amount) {

        if(!types.contains(type)) {
            return;
        } else if(amount.compareTo(type.getMoneyLimit()) == 1) {
            return;
        } else  { Credit c = new Credit(this, type, amount); }
    }

    public void makeRedemption(BigDecimal payment) {

    }

    public void closeCredit(BigDecimal payment) {

    }
}
