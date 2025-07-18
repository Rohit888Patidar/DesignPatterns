package org.example.behavioral.strategy.strategies;

public class PayStrategyOne implements PayStrategy {
    @Override
    public void selectPayStrategy() {
        System.out.println("Executing the Payment one strategy");
    }
}
