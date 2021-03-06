package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit
{
    public SpecialDeposit( BigDecimal depositAmount, int depositPeriod)
    {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income()
    {
        BigDecimal incomeAmount = amount;
        for (int i = 1; i <= period; i++)
        {
            incomeAmount = incomeAmount.add((incomeAmount.multiply(BigDecimal.valueOf(i))).divide(BigDecimal.valueOf(100)));
        }
        incomeAmount = incomeAmount.setScale( 2, RoundingMode.DOWN );
        incomeAmount = incomeAmount.subtract(amount);
        return incomeAmount;
    }
}