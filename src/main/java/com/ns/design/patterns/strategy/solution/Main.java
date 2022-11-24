package com.ns.design.patterns.strategy.solution;

import com.ns.design.patterns.strategy.solution.displayBehaviour.DisplayAsImageBehaviour;
import com.ns.design.patterns.strategy.solution.displayBehaviour.DisplayAsTextBehaviour;
import com.ns.design.patterns.strategy.solution.flyBehaviour.NoFlyBehaviour;
import com.ns.design.patterns.strategy.solution.flyBehaviour.SimpleFlyBehaviour;
import com.ns.design.patterns.strategy.solution.quackBehaviour.NoQuackBehaviour;
import com.ns.design.patterns.strategy.solution.quackBehaviour.SquishQuackBehaviour;

public class Main {

    public static void main(String[] args) {

        Duck cityDuck = new Duck(
                new DisplayAsImageBehaviour(),
                new NoQuackBehaviour(),
                new SimpleFlyBehaviour());

        Duck woodenDuck = new Duck(
                new DisplayAsImageBehaviour(),
                new NoQuackBehaviour(),
                new NoFlyBehaviour());

        Duck RubberDuck =  new Duck(
                new DisplayAsTextBehaviour(),
                new SquishQuackBehaviour(),
                new NoFlyBehaviour());
    }
}
