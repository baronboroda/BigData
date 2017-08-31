package com.zelenin.labs.lab_7_BankCredit;

import java.math.BigDecimal;

public class Credit {

    private CreditTarget target;
    private int monthTerm;
    private float interestRate;
    private BigDecimal amount;
    private BigDecimal payed;
    private boolean isClosed;

    public Credit(CreditTarget target, int monthTerm, float interestRate, BigDecimal amount) {
        this.target = target;
        this.monthTerm = monthTerm;
        this.interestRate = interestRate;
        this.amount = amount;
        this.payed = BigDecimal.ZERO;
        this.isClosed = false;
    }

    public void setTarget(CreditTarget target) {
        this.target = target;
    }

    public CreditTarget getTarget() {
        return target;
    }

    public void setMonthTerm(int monthTerm) {
        this.monthTerm = monthTerm;
    }

    public int getMonthTerm() {
        return monthTerm;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setPayed(BigDecimal payed) {
        this.payed = payed;
    }

    public BigDecimal getPayed() {
        return payed;
    }

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public boolean getIsClosed() {
        return isClosed;
    }

    public BigDecimal getRate() {
        return (amount.divide(BigDecimal.valueOf(100))).multiply(BigDecimal.valueOf(interestRate));
    }

    public BigDecimal getRequiredMonthPayment() {
        return (amount.divide(BigDecimal.valueOf(monthTerm))).add(getRate());
    }

    public BigDecimal getRequiredTotalPayment() {
        return amount.subtract(payed);
    }

    public void increaseCreditLine(int monthQuantity) {
        this.monthTerm =+ monthQuantity;
    }

    public void redemption(BigDecimal payment) {

        if (payment == getRequiredMonthPayment()) {
            this.payed.add(payment);

            if (this.payed == this.amount) {
                this.isClosed = true;
            }
        } else {
            System.out.println("Payment must be equal to " + getRequiredMonthPayment());
            return;
        }
    }

    public void closeCredit(BigDecimal payment) {

        if (payment == getRequiredTotalPayment()) {
            this.payed.add(payment);
            this.isClosed = true;
        } else {
            System.out.println("Payment must be equal to " + getRequiredTotalPayment());
            return;
        }
    }

}
