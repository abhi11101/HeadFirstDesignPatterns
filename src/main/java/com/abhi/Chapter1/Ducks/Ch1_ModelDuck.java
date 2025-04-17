package com.abhi.Chapter1.Ducks;

import com.abhi.Chapter1.Behaviours.Ch1_FlyNoWay;
import com.abhi.Chapter1.Behaviours.Ch1_Quack;
import com.abhi.Chapter1.Ch1_Duck;

public class Ch1_ModelDuck extends Ch1_Duck {

    public Ch1_ModelDuck() {

        flyBehaviour = new Ch1_FlyNoWay();
        quackBehaviour = new Ch1_Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a baby duck");
    }
}
