package com.company;

public class Bank implements BankRules {

    private int depositAmount;
    private String customerName;

    public Bank(int depositAmount, String customerName) {
        this.depositAmount = depositAmount;
        this.customerName = customerName;
    }

    @Override
    public void interestPaid() {
        if(depositAmount<100) {
            System.out.println(customerName +  " The minimum amount is 100 for bank");
        }
        else System.out.println("amount added " + customerName);
    }

}
