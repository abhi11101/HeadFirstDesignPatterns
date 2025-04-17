package com.abhi.Chapter4.FactoryMethod.PizzaStore;

import com.abhi.Chapter4.FactoryMethod.PizzaEntity.*;

public class FM_NYPizzaStore extends FM_PizzaStore{

    @Override
    protected FM_Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new FM_NYStyleCheesePizza();
        }else if (type.equals("pepperoni")){
            return new FM_NYStylePepperoniPizza();
        } else if (type.equals("veggie")){
            return new FM_NYStyleVeggiePizza();
        } else if (type.equals("clam")){
            return new FM_NYStyleClamPizza();
        }
        else return null;
    }
}
