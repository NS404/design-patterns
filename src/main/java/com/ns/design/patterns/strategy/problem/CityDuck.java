package com.ns.design.patterns.strategy.problem;

public class CityDuck extends Duck{

    @Override
    public void fly(){
        System.out.println("Simple fly behaviour");
    }

    @Override
    public void display(){
        System.out.println("Display as image");
    }

    @Override
    public void quack(){
        System.out.println("quack quack");
    }

}
