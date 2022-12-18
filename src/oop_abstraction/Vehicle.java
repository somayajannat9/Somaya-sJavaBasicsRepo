package oop_abstraction;

import oops_inheritance.GrandFather;

public abstract class Vehicle {

    //This abstract class is a hybrid, it can have abstract methods and regular methods.
    //you cannot create object of an abstract class.
    //If any class extend this abstract class, then they will only have to take the abstract methods.
//100% abstraction is a interface.
    // an abstract class is 0-100% abstracted, which means it can have 0 to all abstract methods.


    int wheels;
    String vehicleType;

    //Abstract methods need to have "abstract" before it.

//    abstract void startEngine();
//    abstract void honk();


    //Regular method


    public void brake() {
        System.out.println("vehicle starts");
    }


}
