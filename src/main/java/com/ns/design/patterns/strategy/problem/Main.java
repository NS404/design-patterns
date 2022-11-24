package com.ns.design.patterns.strategy.problem;

public class Main {
    public static void main(String[] args) {

        Duck cityDuck = new CityDuck();

        Duck rubberDuck = new RubberDuck();

        Duck woodenDuck = new WoodenDuck();
    }
}
