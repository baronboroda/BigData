package com.zelenin.labs.lab_7_BankCredit;

import java.math.BigDecimal;

public class CreditPaymentException extends Exception {

    public CreditPaymentException() {}

    public CreditPaymentException(String message)
    {
        super(message);
    }

}
