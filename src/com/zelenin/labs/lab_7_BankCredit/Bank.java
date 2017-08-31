package com.zelenin.labs.lab_7_BankCredit;

public class Bank {

    private String name;
    private String address;
    //...

    public Bank(String name, String address) {
        this.name = name;
        this. address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public String toString() {
        return "Bank " + this.name + ", address: " + this.address;
    }

    //...
}
