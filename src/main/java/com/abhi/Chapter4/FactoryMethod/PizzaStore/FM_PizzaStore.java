package com.abhi.Chapter4.FactoryMethod.PizzaStore;

import com.abhi.Chapter4.FactoryMethod.PizzaEntity.FM_Pizza;

public abstract class FM_PizzaStore {

    public FM_Pizza orderPizza(String type){

        FM_Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // This is the factory method creating different objects
    protected abstract FM_Pizza createPizza(String type);

}
