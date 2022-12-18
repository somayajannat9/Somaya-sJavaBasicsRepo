package oop_abstraction;

public class Tiger implements DomesticAnimal, ZooAnimal {


    //Methods from DomesticAnimal interface
    @Override
    public void sound() {
        System.out.println("A tiger roars");
    }

    @Override
    public void housePet() {
        System.out.println("A tiger is not a house pet");
    }

    @Override
    public void Endangered() {
        System.out.println("A tiger is an endangered animal");

    }

    @Override
    public void whatItEats() {
        System.out.println("A tiger eats meat");
    }


    // Methods from ZooAnimal interface
    @Override
    public void waterAnimal() {
        System.out.println("Tiger is not a water animal");
    }

    @Override
    public void circusAnimal() {
        System.out.println("Tiger is a circus animal");
    }

    @Override
    public void childrenFriendlyAnimal() {
        System.out.println("Tiger is not a children friendly animal");
    }
}
