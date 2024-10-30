package com.simol.strategy;

public class Printer {
    private Strategy strategy;

    public Printer(Strategy strategy) {
        this.strategy = strategy;
    }

    public void out(){
        strategy.print();
    }
}
