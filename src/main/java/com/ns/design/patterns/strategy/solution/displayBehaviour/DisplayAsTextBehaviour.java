package com.ns.design.patterns.strategy.solution.displayBehaviour;

public class DisplayAsTextBehaviour implements IDisplayBehaviour{
    @Override
    public void display() {
        System.out.println("Display Duck as Text");
    }
}
