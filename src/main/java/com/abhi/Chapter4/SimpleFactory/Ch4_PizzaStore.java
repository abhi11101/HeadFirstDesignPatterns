package com.abhi.Chapter4.SimpleFactory;

import com.abhi.Chapter4.SimpleFactory.Factory.Ch4_SimplePizzaFactory;
import com.abhi.Chapter4.SimpleFactory.PizzaEntity.Ch4_Pizza;

public class Ch4_PizzaStore {

    private Ch4_SimplePizzaFactory pizzaFactory;

    public Ch4_PizzaStore(Ch4_SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Ch4_Pizza createPizza(String type) {

        Ch4_Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
