package com.company;

public class Bank_Account {
    int account_number;
    String name;
    String phone_number;
    double balance;

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printf(){
        System.out.println(name+"  "+account_number+"  "+phone_number+" Remaining Balance "+balance+"    ");
    }
    public void deposit(int new_money){
             balance=new_money+balance;
             printf();
             System.out.println("Deposit Money "+new_money);
             //return balance;
    }
    public void withdraw(int new_money){
           if(new_money>balance){
               printf();
               System.out.println("Insufficient Balance ");
               //return balance;
           }
           else {
               balance=balance-new_money;
               printf();
               System.out.println("Withdrawal Balance "+new_money);
               //return balance;
           }
    }

}

