package com.ns.design.patterns.strategy.solution.flyBehaviour;


import com.ns.design.patterns.strategy.solution.flyBehaviour.IFlyBehaviour;

public class SimpleFlyBehaviour implements IFlyBehaviour {


    @Override
    public void fly() {
        System.out.println("Simple fly Behaviour");
    }
}
