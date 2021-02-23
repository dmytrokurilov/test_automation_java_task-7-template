package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

class SpecialDeposit extends Deposit {
    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal summa = amount;

        for (BigDecimal i = BigDecimal.ONE; i.compareTo(BigDecimal.valueOf(period)) <= 0; i = i.add(BigDecimal.ONE)) {
            summa = summa.multiply(i.multiply(BigDecimal.valueOf(0.01)));
        }
        return summa.setScale(2, RoundingMode.DOWN).subtract(amount);

    }
}
