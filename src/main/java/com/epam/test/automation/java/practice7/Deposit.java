package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

public abstract class Deposit {
    protected BigDecimal amount;
    final int period;

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }

    protected Deposit(BigDecimal depositAmount, int depositPeriod) {
        amount = depositAmount;
        period = depositPeriod;
    }

    public abstract BigDecimal income();
}
