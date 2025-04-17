package com.abhi.Chapter1.Behaviours;

public class Ch1_MuteQuack implements Ch1_QuackBehaviour {


    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
