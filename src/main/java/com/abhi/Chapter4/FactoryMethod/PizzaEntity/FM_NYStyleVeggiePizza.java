package com.abhi.Chapter4.FactoryMethod.PizzaEntity;

public class FM_NYStyleVeggiePizza extends FM_Pizza{

    public FM_NYStyleVeggiePizza() {

        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");

    }
}
