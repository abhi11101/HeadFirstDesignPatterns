package com.abhi.Chapter4.FactoryMethod;

import com.abhi.Chapter4.FactoryMethod.PizzaEntity.FM_Pizza;
import com.abhi.Chapter4.FactoryMethod.PizzaStore.FM_ChicagoPizzaStore;
import com.abhi.Chapter4.FactoryMethod.PizzaStore.FM_NYPizzaStore;
import com.abhi.Chapter4.FactoryMethod.PizzaStore.FM_PizzaStore;

public class Ch4_FmMain {

    public static void main(String[] args) {

        FM_PizzaStore nyStore = new FM_NYPizzaStore();
        FM_PizzaStore chicagoStore = new FM_ChicagoPizzaStore();


        FM_Pizza pizza =  nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Harry ordered a " + pizza.getName() + "\n");
    }

}
