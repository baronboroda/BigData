package com.zelenin.labs.lab_7_BankCredit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/*Demo class*/

public class BankApp {

    public static Collection<Bank> banks = new ArrayList<>();

    public static void main(String[] args) {

        /* Let's create some data for test */
        dataPrepare();

        /* Let's find credit offers by target from different banks */
        findCreditOffersByTarget();

    }

    public static void dataPrepare() {
        Bank b1 = new Bank("PrivatBank", "some address");
        Bank b2 = new Bank("AlphaBank", "some address");
        Bank b3 = new Bank("CreditAgricoleBank", "some address");

        banks.add(b1);
        banks.add(b2);
        banks.add(b3);

        b1.addType(new CreditType(CreditTarget.CASH, BigDecimal.valueOf(100000), 36, true, 5));
        b1.addType(new CreditType(CreditTarget.CAR, BigDecimal.valueOf(200000), 24, true, 10));
        b1.addType(new CreditType(CreditTarget.TRAVEL, BigDecimal.valueOf(10000), 12, true, 3));

        b2.addType(new CreditType(CreditTarget.EDUCATION, BigDecimal.valueOf(80000), 60, true, 0));
        b2.addType(new CreditType(CreditTarget.CAR, BigDecimal.valueOf(500000), 50, true, 3));
        b2.addType(new CreditType(CreditTarget.TRAVEL, BigDecimal.valueOf(10000), 24, true, 6));

        b3.addType(new CreditType(CreditTarget.CASH, BigDecimal.valueOf(90000), 15, true, 1));
        b3.addType(new CreditType(CreditTarget.CAR, BigDecimal.valueOf(2000000), 40, true, 5));
        b3.addType(new CreditType(CreditTarget.TRAVEL, BigDecimal.valueOf(150000), 12, true, 0));
    }

    public static void findCreditOffersByTarget() {
        Integer iChoice;
        System.out.println("Enter credit target: ");
        System.out.println("1 - Cash\n" +
                "2 - Realty\n" +
                "3 - Education\n" +
                "4 - Travel\n" +
                "5 - Car");
        Scanner scanner = new Scanner(System.in);

        iChoice = scanner.nextInt();

        switch (iChoice) {
            case 1:
                findCreditByTarget(CreditTarget.CASH); break;
            case 2:
                findCreditByTarget(CreditTarget.REALTY); break;
            case 3:
                findCreditByTarget(CreditTarget.EDUCATION); break;
            case 4:
                findCreditByTarget(CreditTarget.TRAVEL); break;
            case 5:
                findCreditByTarget(CreditTarget.CAR); break;
            default:
                System.out.println("Wrong choice"); break;
        }
    }

    public static void findCreditByTarget(CreditTarget target) {


        System.out.println("Search result by target: " + target);
        for(Bank b : banks) {
            for(CreditType c : b.getTypes()) {
                if(c.getTarget().equals(target)) {
                    System.out.println(b + "; " + c);
                }
            }
        }

    }

}
