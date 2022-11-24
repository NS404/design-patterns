package com.ns.design.patterns.strategy.problem;

public class WoodenDuck extends Duck{

    @Override
    public void fly(){
        System.out.println("No fly behaviour");
    }

    @Override
    public void display(){
        System.out.println("display as image");
    }

    @Override
    public void quack(){
        System.out.println("No quack behaviour");
    }
}
