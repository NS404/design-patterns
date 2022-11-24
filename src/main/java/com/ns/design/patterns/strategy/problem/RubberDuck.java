package com.ns.design.patterns.strategy.problem;

public class RubberDuck extends Duck {

    @Override
    public void fly(){
        System.out.println("No fly behaviour");
    }

    @Override
    public void display(){
        System.out.println("Display as text");
    }

    @Override
    public void quack(){
        System.out.println("squish squish");
    }

}