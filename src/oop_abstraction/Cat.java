package oop_abstraction;

public class Cat implements DomesticAnimal, ZooAnimal {
    //** A class can implement from multiple interfaces unlike a class that cannot inherit from more than 1 class.
    // This class implements from the parent class _________, therefore, it will inherit all of
    // the parent class's methods which do not have any body, are brought to the child class then we can give them a body.


    // These methods are from the parent class "__________". This is called overriding


    //Calling variable from the domesticAnimal Interface, we need to call it from the test class in order to execute.


    Cat(String catchPhrase) {
        System.out.println("Iam a cat");
    }

    @Override
    public void sound() {
        System.out.println("A cat meaows");
    }

    @Override
    public void housePet() {
        System.out.println();
    }

    @Override
    public void Endangered() {
        System.out.println("A cat is not a endangered animal");
    }

    @Override
    public void whatItEats() {
        System.out.println("A cat eats fish");


        // Cat class methods


    }

    @Override
    public void waterAnimal() {
        System.out.println("cat is not a water animal");
    }

    @Override
    public void circusAnimal() {
        System.out.println("cat is not a circus animal");
    }

    @Override
    public void childrenFriendlyAnimal() {
        System.out.println("a cat is a children friendly animal");
    }


    //Separate methods for Cat class

    public void chaseRats() {
        System.out.println("Cats chase rats");
    }
}
