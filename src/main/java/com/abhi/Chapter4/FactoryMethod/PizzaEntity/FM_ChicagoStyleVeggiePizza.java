package com.abhi.Chapter4.FactoryMethod.PizzaEntity;

public class FM_ChicagoStyleVeggiePizza extends FM_Pizza{

    public FM_ChicagoStyleVeggiePizza() {

        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");

    }
}
