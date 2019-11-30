package ru.bankapp.logic;

import org.w3c.dom.ls.LSOutput;

public class TestAccount {
    public static void main(String[] args) {

    Bank myBank = new Bank ();
    Customer firstCustomer = new Customer("Max Fray");
    Customer secondCustomer = new Customer("Serg Plaxt");

    SavingAccount MaxSaving = new SavingAccount(1000,10);
    CheckingAccount SergAccount = new CheckingAccount(500, 100);
    firstCustomer.addAccount(MaxSaving);
    secondCustomer.addAccount(SergAccount);
    myBank.addCustomer(firstCustomer);
    myBank.addCustomer(secondCustomer);

        System.out.println(myBank.getCustomer(0));
        System.out.println(myBank.getCustomer(1));
    }
}
