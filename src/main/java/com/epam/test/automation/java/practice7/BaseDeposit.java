package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

class BaseDeposit extends Deposit {
    public BaseDeposit(BigDecimal depositAmount, int depositPeriod) {

    super(depositAmount, depositPeriod);

    }

    @Override
    public BigDecimal income() {
        BigDecimal percent = BigDecimal.valueOf(0.050000000);
        BigDecimal sumAdded;
        BigDecimal money = amount;
        for (int i = 0; i < period; i++) {
            sumAdded = money.multiply(percent);
            money = money.add(sumAdded);
        }
        return money.subtract(amount);
    }
}
