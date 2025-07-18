package org.example.behavioral.strategy;

import org.example.behavioral.strategy.strategies.PayStrategy;
import org.example.behavioral.strategy.strategies.PayStrategyOne;

public class CreditPay implements PaymentMethod{

    private PayStrategy payStrategy;

    public CreditPay()
    {
        this.payStrategy = new PayStrategyOne();
    }

    @Override
    public void pay() {
        payStrategy.selectPayStrategy();
    }
}
