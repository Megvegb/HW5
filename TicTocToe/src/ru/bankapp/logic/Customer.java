package ru.bankapp.logic;

import java.util.Arrays;

public class Customer {
    private Account [] accounts;
    private String fullName;
    private int customerNumber;
    private static int customerNumberBase = 1000;
    private int numOfAccount;

    public Customer (String fullName){
        accounts = new Account [10];
        this.fullName = fullName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccount = 0;
    }

    public Account getAccount (int AccNo){
        if(AccNo < accounts.length && numOfAccount != 0) {
            return accounts[AccNo];
        }
        return null;
    }

    @Override
    public String toString() {
        return  "fullName='" + fullName + '\'' +
                ", customerNumber=" + customerNumber +
                ", numOfAccount=" + numOfAccount +
                '}';
    }

    public void addAccount (Account acc) {
        accounts [numOfAccount] = acc;
        numOfAccount++;

    }
}
