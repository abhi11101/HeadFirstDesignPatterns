package com.abhi.Chapter4.FactoryMethod.PizzaEntity;

public class FM_ChicagoStyleCheesePizza extends FM_Pizza{

    public FM_ChicagoStyleCheesePizza() {

        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");

    }
}
