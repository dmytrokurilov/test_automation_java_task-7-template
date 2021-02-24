package com.epam.test.automation.java.practice7;


import java.math.BigDecimal;


public class Client {
    private final Deposit[] deposits;

    public Client() {
        deposits = new Deposit[10];
    }

    public boolean addDeposit(Deposit deposit) {
        for (int i = 0; i < 10; i++) {
            if (deposits[i] == null) {
                deposits[i] = deposit;
                return true;
            }
        }
        return false;
    }

    public BigDecimal totalIncome() {
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < 10; i++) {
            if (deposits[i] != null) {
                sum = sum.add(deposits[i].income());
            }
        }
        return sum;
    }

    public BigDecimal maxIncome() {
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (deposits[i] != null && deposits[i].income().compareTo(deposits[max].income()) > 0)
                max = i;
        }
        assert deposits[max] != null;
        return deposits[max].income();
    }

    public BigDecimal getIncomeByNumber(int number) {
        if (deposits[number - 1] != null)
            return deposits[number - 1].income();
        else
            return BigDecimal.ZERO.setScale(0);
    }

}
