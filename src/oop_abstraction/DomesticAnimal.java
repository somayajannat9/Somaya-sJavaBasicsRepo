package oop_abstraction;

public interface DomesticAnimal {

    // An interface is like a road map.
    // An interface will have 100% abstraction
    // All animals have some methods and attributes. An interface will contain all of those
    //common methods and attributes in case of any specific animal class is created.
    // * That specific animal must have all the methods from the parent interface.
    // * All variables declared in an interface is final by default and all methods are public by default.


    //No method body, only method declaration
    //method prototype
    //cannot create an object of interface
    //no static methods but variables are static/final by default


    int numOfLegs = 4;
    String color = "Brown";
    int weightLb = 10;

    void sound();

    void housePet();

    void Endangered();

    void whatItEats();

}
