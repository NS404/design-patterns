package com.ns.design.patterns.strategy.solution.flyBehaviour;

import com.ns.design.patterns.strategy.solution.flyBehaviour.IFlyBehaviour;

public class NoFlyBehaviour implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I don't fly");
    }
}
