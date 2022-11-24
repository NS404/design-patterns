package com.ns.design.patterns.strategy.solution.displayBehaviour;

public class DisplayAsImageBehaviour implements IDisplayBehaviour {
    @Override
    public void display() {
        System.out.println("Display duck as image");
    }
}
