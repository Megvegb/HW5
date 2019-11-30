package ru.bankapp.logic;

public class CheckingAccount extends Account {
    private double overdrawAmount;

    public CheckingAccount (double InitBalance, double overdraftAmount) {
        this.balance = InitBalance;
        this.overdrawAmount = overdraftAmount;
    }

    public CheckingAccount (double InitBalance) {
        this(InitBalance, 0);
    }

    @Override
    public boolean withDraw (double amt)  {
        if (amt <= balance + overdrawAmount){
                balance = balance - amt;
                return true;
            }
            return false;
        }
}
