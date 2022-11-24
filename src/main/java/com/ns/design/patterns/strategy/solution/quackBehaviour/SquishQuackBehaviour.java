package com.ns.design.patterns.strategy.solution.quackBehaviour;

public class SquishQuackBehaviour implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squish Squish");
    }
}
