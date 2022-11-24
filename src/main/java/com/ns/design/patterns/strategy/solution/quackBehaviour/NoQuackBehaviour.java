package com.ns.design.patterns.strategy.solution.quackBehaviour;

public class NoQuackBehaviour implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I don't quack");
    }
}
