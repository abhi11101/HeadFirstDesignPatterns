package com.abhi.Chapter1;

import com.abhi.Chapter1.Behaviours.Ch1_FlyBehaviour;
import com.abhi.Chapter1.Behaviours.Ch1_QuackBehaviour;

public abstract class Ch1_Duck {

    protected Ch1_FlyBehaviour flyBehaviour;
    protected Ch1_QuackBehaviour quackBehaviour;

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){

        flyBehaviour.fly();
    }

    public void swim(){

        System.out.println("All ducks swim even the decoys");
    }

    public void setFlyBehaviour(Ch1_FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(Ch1_QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();

}
