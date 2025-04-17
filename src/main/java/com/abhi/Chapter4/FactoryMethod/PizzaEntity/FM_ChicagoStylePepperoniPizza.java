package com.abhi.Chapter4.FactoryMethod.PizzaEntity;

public class FM_ChicagoStylePepperoniPizza extends FM_Pizza{

    public FM_ChicagoStylePepperoniPizza() {

        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Sliced Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");

    }
}
