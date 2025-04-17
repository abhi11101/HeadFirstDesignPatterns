package com.abhi.Chapter4.FactoryMethod.PizzaEntity;

public class FM_NYStyleCheesePizza extends FM_Pizza{

    public FM_NYStyleCheesePizza() {

        name = "NY Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

}
