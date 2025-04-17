package com.abhi.Chapter4.FactoryMethod.PizzaEntity;


public class FM_NYStyleClamPizza extends  FM_Pizza{

    public FM_NYStyleClamPizza() {

        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");

    }
}
