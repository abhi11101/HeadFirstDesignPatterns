package com.abhi.Chapter1;

import com.abhi.Chapter1.Behaviours.Ch1_FlyWithRocket;
import com.abhi.Chapter1.Ducks.Ch1_MallardDuck;
import com.abhi.Chapter1.Ducks.Ch1_ModelDuck;

public class Ch1_Main {

    public static void main(String[] args) {

        Ch1_Duck mDuck = new Ch1_MallardDuck();

        mDuck.performQuack();
        mDuck.performFly();
        mDuck.display();
        mDuck.swim();


        // More dynamic by using setter method we are setting fly behaviour at runtime.
        Ch1_Duck babyDuck = new Ch1_ModelDuck();
        babyDuck.performFly();
        babyDuck.setFlyBehaviour(new Ch1_FlyWithRocket());
        babyDuck.performFly();


    }
}
