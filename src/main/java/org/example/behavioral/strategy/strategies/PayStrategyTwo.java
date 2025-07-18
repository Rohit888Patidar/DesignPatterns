package org.example.behavioral.strategy.strategies;

public class PayStrategyTwo implements PayStrategy{

    @Override
    public void selectPayStrategy() {
        System.out.println("Executing the Payment two strategy");
    }
}