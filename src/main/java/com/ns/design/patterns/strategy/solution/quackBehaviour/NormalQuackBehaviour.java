package com.ns.design.patterns.strategy.solution.quackBehaviour;

public class NormalQuackBehaviour implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
