package com.zelenin.labs.lab_7_BankCredit;

import java.math.BigDecimal;

public class CreditType {

    private CreditTarget target;
    private BigDecimal moneyLimit;
    private int monthLimit;
    private boolean isEarlyRepayment;
    private float interestRate;

    public CreditType(CreditTarget target, BigDecimal moneyLimit, int monthLimit, boolean isEarlyRepayment, float interestRate) {
        this.target = target;
        this.moneyLimit = moneyLimit;
        this.monthLimit = monthLimit;
        this.isEarlyRepayment = isEarlyRepayment;
        this.interestRate = interestRate;
    }

    public CreditTarget getTarget() {
        return target;
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

    @Override
    public String toString() {
        return "Target: " + target + "; money limit = " + moneyLimit +
                "; month limit = " + monthLimit + "; is early repayment: " + isEarlyRepayment +
                ";interest rate = " + interestRate;
    }
}
