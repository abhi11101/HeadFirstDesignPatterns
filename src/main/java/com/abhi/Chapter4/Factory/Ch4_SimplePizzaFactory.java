package com.abhi.Chapter4.Factory;

import com.abhi.Chapter4.PizzaEntity.*;

public class Ch4_SimplePizzaFactory {

    public Ch4_Pizza createPizza(String type) {

        Ch4_Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new Ch4_CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new Ch4_PepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new Ch4_ClamPizza();
        } else if (type.equals("veggie")){
            pizza = new Ch4_VeggiePizza();
        }
        return pizza;
    }
}
