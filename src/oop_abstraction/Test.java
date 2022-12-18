package oop_abstraction;

public class Test {

    //The methods from the parent interfaces were overridden on the children classes. Let's test them.

    public static void main(String[] args) {

        Cat c = new Cat("Iam a cat");         //An object with a parameterized constructor that was
        //created on the original class but given arguments at the current class.
        c.whatItEats();                        //overridden methods.
        c.childrenFriendlyAnimal();
        c.circusAnimal();
        c.sound();
        c.Endangered();
        c.housePet();
        System.out.println(DomesticAnimal.color);    // way to call an attribute from a parent interface
        c.chaseRats();

        Tiger t = new Tiger();            // default constructor

        t.childrenFriendlyAnimal();         //overridden methods
        t.circusAnimal();
        t.Endangered();
        t.sound();
        t.waterAnimal();
        System.out.println(DomesticAnimal.numOfLegs);          //way to call an attribute from a parent interface


        //We can create object of cat and tiger, but we cannot create object of parent interface
        // But we can create a reference of interface which can refer to child class.

        DomesticAnimal da = new Tiger();
        da.Endangered();                      //Now we can call all methods/attributes from the parent interface
        // but not child interface because tiger is not the reference type.


    }


}
