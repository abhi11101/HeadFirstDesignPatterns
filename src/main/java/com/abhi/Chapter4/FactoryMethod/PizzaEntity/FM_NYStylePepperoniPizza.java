package com.abhi.Chapter4.FactoryMethod.PizzaEntity;

public class FM_NYStylePepperoniPizza extends FM_Pizza{

    public FM_NYStylePepperoniPizza() {

        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");

    }
}
