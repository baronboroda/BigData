package com.zelenin.labs.lab_7_BankCredit;

import java.math.BigDecimal;

public class Credit {

    private Bank bank;
    private CreditType type;
    private BigDecimal amount;
    private BigDecimal payed;
    private boolean isClosed;

    public Credit(Bank bank, CreditType type, BigDecimal amount) {
        this.bank = bank;
        this.type = type;
        this.amount = amount;
        this.payed = BigDecimal.ZERO;
        this.isClosed = false;
    }

    public void increaseCreditLine(BigDecimal additionAmount) {
        amount = amount.add(additionAmount);
    }

    public void makeRedemption(BigDecimal payment){
        if(type.getEarlyRepayment() && payment == amount.subtract(payed)) {
            close(payment);
        } else {
            payed = payed.add(payment);
            if (payed == amount) {
                isClosed = true;
            }
        }
    }

    public void close(BigDecimal payment) {
        payed = payed.add(payment);
        isClosed = true;
    }
}