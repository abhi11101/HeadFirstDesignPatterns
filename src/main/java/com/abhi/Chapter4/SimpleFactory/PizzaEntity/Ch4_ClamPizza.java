package com.abhi.Chapter4.SimpleFactory.PizzaEntity;

public class Ch4_ClamPizza extends Ch4_Pizza{

    @Override
    public void prepare() {

        System.out.println("Preparing Clam Pizza");

    }

    @Override
    public void bake() {

        System.out.println("Baking Clam Pizza");

    }

    @Override
    public void cut() {
        System.out.println("Cutting Clam Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Clam Pizza");
    }
}
