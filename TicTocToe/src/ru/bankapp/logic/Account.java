package ru.bankapp.logic;

public class Account {
    protected double balance;

    public Account () {
        this.balance = 0;
    }

    protected Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public boolean deposite (double amt) {
        if (amt >= 0) {
            balance += amt;
            return true;
        }
        return false;
    }

    public boolean withDraw (double amt) {
        if (amt <= balance){
          balance -= amt;
          return true;
        }
        return false;
    }


    public double getBalance(){
        return balance;
    }
}
