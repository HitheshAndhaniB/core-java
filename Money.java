package com.toString.in;

public class Money {
    String moneyType;
    double totalMoney;

    public Money(String moneyType, double totalMoney) {
        this.moneyType = moneyType;
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        System.out.println("RUnning tostring in Money ");

        return "Money info={" +
                "moneyType='" + moneyType + '\'' +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
