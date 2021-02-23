package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

public class LongDeposit extends Deposit implements IProlongable {
    public LongDeposit(BigDecimal depositAmount, int depositPeriod) {

        super(depositAmount, depositPeriod);

    }

    @Override
    public BigDecimal income() {
        BigDecimal incomeAmount = amount;
        for (BigDecimal i = new BigDecimal(7); i.compareTo(BigDecimal.valueOf(period)) <= 0; i.add(i)) {
            incomeAmount = incomeAmount.multiply(BigDecimal.valueOf(1.15));
        }
        return incomeAmount.setScale(2).subtract(amount);
    }

    public boolean canToProlong() {
        if (period <= 36) {
            return true;
        } else {
            return false;
        }
    }


}
