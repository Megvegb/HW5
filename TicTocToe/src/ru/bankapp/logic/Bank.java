package ru.bankapp.logic;

public class Bank {

    private Customer [] customer;
    private int numOfClients;

    protected Bank () {
        this.customer = new Customer[1000];
        numOfClients = 0;
    }

    public Customer getCustomer (int custNo) {
        if (custNo < customer.length) {
            return customer [custNo];
        }
        return null;
    }

    public void addCustomer(Customer newCustomer) {
        customer[numOfClients] = newCustomer;
        numOfClients++;

    }
}
