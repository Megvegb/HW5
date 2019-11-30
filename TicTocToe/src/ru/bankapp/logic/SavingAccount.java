package ru.bankapp.logic;

public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount (double InitBalance, double interestRate ){
        this.balance = InitBalance;
        this.interestRate = interestRate;
    }

    public void addInterestRate(){
        this.balance = balance + balance * interestRate/100;
    }
}
