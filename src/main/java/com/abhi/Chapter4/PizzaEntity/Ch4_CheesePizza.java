package com.abhi.Chapter4.PizzaEntity;

public class Ch4_CheesePizza extends Ch4_Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Cheese Pizza");
    }
}
