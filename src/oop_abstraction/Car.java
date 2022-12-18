package oop_abstraction;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle() {
            @Override
            void startEngine() {

            }
        };
        veh.startEngine();

    }

    @Override
    void startEngine() {
        System.out.println("This car has an engine");
    }

    @Override
    public void brake() {
        System.out.println("Car starts");
    }
}

