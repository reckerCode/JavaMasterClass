package com.reckercode;

import java.util.Scanner;

public class Bank {
    double totalBalance;
    int numberOfClients;
    String address;

    public Bank(double totalBalance, int numberOfClients, String address) {
        this.totalBalance = totalBalance;
        this.numberOfClients = numberOfClients;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "totalBalance=" + totalBalance +
                ", numberOfClients=" + numberOfClients +
                ", address='" + address + '\'' +
                '}';
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public String getAddress() {
        return address;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
