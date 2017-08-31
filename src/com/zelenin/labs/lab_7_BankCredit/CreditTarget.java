package com.zelenin.labs.lab_7_BankCredit;

public enum CreditTarget {

    CASH, REALTY, EDUCATION, TRAVEL, CAR;

    public String toString() {
        switch (this) {
            case CASH:
                return "Getting cash";
            case REALTY:
                return "Buying realty";
            case EDUCATION:
                return "Getting education";
            case TRAVEL:
                return "Travel";
            case CAR:
                return "Buying a car";
            default:
                return "no target";
        }
    }
}
