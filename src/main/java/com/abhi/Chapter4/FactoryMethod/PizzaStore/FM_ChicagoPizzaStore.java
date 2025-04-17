package com.abhi.Chapter4.FactoryMethod.PizzaStore;

import com.abhi.Chapter4.FactoryMethod.PizzaEntity.*;

public class FM_ChicagoPizzaStore extends FM_PizzaStore{


    @Override
    protected FM_Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new FM_ChicagoStyleCheesePizza();
        }else if (type.equals("pepperoni")){
            return new FM_ChicagoStylePepperoniPizza();
        }else if (type.equals("clam")){
            return new FM_ChicagoStyleClamPizza();
        }else if (type.equals("veggie")){
            return new FM_ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
