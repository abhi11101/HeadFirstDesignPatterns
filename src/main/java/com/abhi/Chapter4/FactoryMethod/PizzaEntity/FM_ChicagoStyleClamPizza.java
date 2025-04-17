package com.abhi.Chapter4.FactoryMethod.PizzaEntity;

public class FM_ChicagoStyleClamPizza extends FM_Pizza{

    public FM_ChicagoStyleClamPizza() {

        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");

    }
}
