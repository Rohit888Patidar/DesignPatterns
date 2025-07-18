package org.example.behavioral.strategy;

import org.example.behavioral.strategy.strategies.PayStrategy;
import org.example.behavioral.strategy.strategies.PayStrategyTwo;

public class UPIPay implements PaymentMethod{
    private PayStrategy payStrategy;

    public UPIPay()
    {
        this.payStrategy = new PayStrategyTwo();
    }

    @Override
    public void pay() {
        payStrategy.selectPayStrategy();
    }
}
