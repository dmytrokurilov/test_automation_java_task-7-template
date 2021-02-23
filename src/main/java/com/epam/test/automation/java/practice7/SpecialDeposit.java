package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

class SpecialDeposit extends Deposit {
    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal summa = amount;

        for (BigDecimal i = new BigDecimal(1); i.compareTo(BigDecimal.valueOf(period)) <= 0; i.add(i))
            summa = summa.add(i.multiply(BigDecimal.valueOf(0.01)));//застрял здесь

        return summa.setScale(2).subtract(amount);
    }
}
