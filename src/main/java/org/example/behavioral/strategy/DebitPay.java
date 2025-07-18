package org.example.behavioral.strategy;

import org.example.behavioral.strategy.strategies.PayStrategy;
import org.example.behavioral.strategy.strategies.PayStrategyOne;

public class DebitPay implements PaymentMethod{


    private PayStrategy payStrategy;

    public DebitPay()
    {
        this.payStrategy = new PayStrategyOne();
    }

    @Override
    public void pay() {
        payStrategy.selectPayStrategy();
    }
}
