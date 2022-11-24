package com.ns.design.patterns.strategy.solution;

import com.ns.design.patterns.strategy.solution.displayBehaviour.IDisplayBehaviour;
import com.ns.design.patterns.strategy.solution.flyBehaviour.IFlyBehaviour;
import com.ns.design.patterns.strategy.solution.quackBehaviour.IQuackBehaviour;

public class Duck {

    private IDisplayBehaviour displayBehaviour;
    private IQuackBehaviour quackBehaviour;
    private IFlyBehaviour flyBehaviour;


    public Duck(IDisplayBehaviour displayBehaviour,
                IQuackBehaviour quackBehaviour,
                IFlyBehaviour flyBehaviour) {
        this.displayBehaviour = displayBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public void display(){
        this.displayBehaviour.display();
    }

    public void quack(){
        this.quackBehaviour.quack();
    }

    public void fly(){
        this.flyBehaviour.fly();
    }
}

