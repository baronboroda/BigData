package com.zelenin.labs.lab_7_BankCredit;

import java.math.BigDecimal;

public class CreditType {

    private String name;
    private CreditTarget target;
    private BigDecimal moneyLimit;
    private int monthLimit;
    private boolean isEarlyRepayment;
    private float interestRate;

    public CreditTarget getTarget() {
        return target;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMoneyLimit(BigDecimal moneyLimit) {
        this.moneyLimit = moneyLimit;
    }

    public BigDecimal getMoneyLimit() {
        return moneyLimit;
    }

    public void setMonthLimit(int monthLimit) {
        this.monthLimit = monthLimit;
    }

    public int getMonthLimit() {
        return monthLimit;
    }

    public void setEarlyRepayment( boolean isEarlyRepayment) {
        this.isEarlyRepayment = isEarlyRepayment;
    }

    public boolean getEarlyRepayment() {
        return isEarlyRepayment;
    }

    public void setInterestRate (float interestRate) {
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }
}
