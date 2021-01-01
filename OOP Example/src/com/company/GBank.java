package com.company;

public class GBank implements BankRules {

    private int depositAmount;
    private String customerName;

    public GBank(int depositAmount, String customerName) {
        this.depositAmount = depositAmount;
        this.customerName = customerName;
    }

    @Override
    public void interestPaid() {
        if(depositAmount<70) {
            System.out.println( customerName +" The minimum amount is 70 for Gbank");
        }
        else System.out.println("the amount added!");
    }
}
