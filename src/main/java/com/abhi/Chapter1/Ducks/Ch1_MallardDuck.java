package com.abhi.Chapter1.Ducks;

import com.abhi.Chapter1.Behaviours.Ch1_FlyWithWings;
import com.abhi.Chapter1.Behaviours.Ch1_Quack;
import com.abhi.Chapter1.Ch1_Duck;

public class Ch1_MallardDuck extends Ch1_Duck {


    public Ch1_MallardDuck() {
        flyBehaviour = new Ch1_FlyWithWings();
        quackBehaviour = new Ch1_Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }



}
