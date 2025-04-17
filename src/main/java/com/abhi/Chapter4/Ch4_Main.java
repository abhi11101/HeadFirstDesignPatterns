package com.abhi.Chapter4;

import com.abhi.Chapter4.Factory.Ch4_SimplePizzaFactory;

public class Ch4_Main {

    public static void main(String[] args) {

        Ch4_SimplePizzaFactory pizzaFactory = new Ch4_SimplePizzaFactory();

        Ch4_PizzaStore pizzaStore = new Ch4_PizzaStore(pizzaFactory);
        pizzaStore.createPizza("cheese");
    }

}
