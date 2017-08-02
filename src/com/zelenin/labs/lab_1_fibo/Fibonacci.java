package com.zelenin.labs.lab_1_fibo;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.print("Enter fibonacci numbers quantity: ");
        Scanner scanner = new Scanner(System.in);
        Integer iNumber = 0;
        String sNumber;
        sNumber = scanner.next();

        while(!isInputChecked(sNumber)) {
            sNumber = scanner.next();
        }

        iNumber = Integer.parseInt(sNumber);
        printFibonacciNumbers(iNumber);

        System.out.println("-------------------------------");
        System.out.print("Enter number to get fibonacci: ");
        sNumber = scanner.next();

        while(!isInputChecked(sNumber)) {
            sNumber = scanner.next();
        }

        iNumber = Integer.parseInt(sNumber);

        System.out.println("Result for number " + iNumber + ": ");
        String output = String.format("%s = %d", iNumber, fibo(BigInteger.valueOf(iNumber), BigInteger.ZERO, BigInteger.ONE));
        System.out.println(output);

    }

    public static void printFibonacciNumbers (int quantity) {
        if (quantity == 0) {
            System.out.println("No result for zero quantity.");
            return;
        }
        System.out.println("-------------------------------");
        System.out.println("Result for quantity " + quantity + ": ");
        int evenQuantity = 0;
        int oddQuantity = 0;
        for(int i = 0; i <= quantity; i++) {
            BigInteger result = fibo(BigInteger.valueOf(i), BigInteger.ZERO, BigInteger.ONE);
            if(isEven(result)) {
                evenQuantity++;
            } else {
                oddQuantity++;
            }

            String output = String.format("%s = %d", i, result);
            System.out.println(output);
        }

        System.out.println("-------------------------------");

        BigDecimal evenPercent = BigDecimal.valueOf((double) (evenQuantity * 100) / (evenQuantity + oddQuantity));
        evenPercent = evenPercent.setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal oddPercent = BigDecimal.valueOf((double) (oddQuantity * 100) / (evenQuantity + oddQuantity));
        oddPercent = oddPercent.setScale(2, BigDecimal.ROUND_HALF_UP);

        System.out.println("Even numbers: " + evenPercent + "%");
        System.out.println("Odd numbers: " + oddPercent + "%");
    }

    public static BigInteger fibo(BigInteger arg, BigInteger current, BigInteger next) {
        return  arg.equals(BigInteger.ZERO) ? current : fibo(arg.subtract(BigInteger.ONE), next, current.add(next));
    }

    public static boolean isEven(BigInteger arg) {
        return (arg.mod(new BigInteger("2")).equals(BigInteger.ZERO)) ? true : false;
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static boolean isBiggerThanZero (String str) {
        return Integer.parseInt(str) >= 0;
    }

    public static boolean isInputChecked(String str) {
        if (isInteger(str)) {
            if (isBiggerThanZero(str)) {
                return true;
            } else {
                System.out.println("ERROR! Input parameter must be bigger than zero. Try Again.");
                return false;
            }
        } else {
            System.out.println("ERROR! Input parameter must be an integer number. Try Again.");
            return false;
        }
    }
}