package constructorConcept;

public class Constructor {

    // a constructor is a class entity that is used to define some class features while creating objects.
    // while creating the object if you want to define some class features in the form of global variables with objects
    // then you need a constructor.

    // a user created constructor needs to be created outside of the main method.

    //Bellow, we gave our constructor 2 parameters, in those parameters, we will give 2 arguments.
    // We can overload a constructor.
    //We have to first declare our variables.

    int num1;
    int num2;

    String name = "Sandy";
    String anotherName = "Sara";


    int a;
    int b;

    public void toConstruct(int a, int b) {
        System.out.println(a + b);
        this.a = a;
        this.b = b;
    }

    Constructor(int num1, int num2) {
        System.out.println("The value of num1 and num 2 is: " + num1 + " and " + num2);

        this.num1 = num1;
        this.num2 = num2;                       // we want to be clear that the declared num1 and num2 values are the same as
        // the values in the argument for num1 and num2.
    }


    Constructor(String name, String anotherName) {
        System.out.println("Name 1 is " + name + ", Name 2 is " + anotherName);

        this.name = name;
        this.anotherName = anotherName;           //initialize the class variables inside the constructor
    }


    Constructor(int x, int y, int z) {
        System.out.println(x + " " + y + " " + z + " " + " are the numbers of this constructor");
    }


    //A constructor is not a function or a method, it does not return anything.


    public static void main(String[] args) {

        // We will create an object or the Constructor class in order to execute/test it. Automatically, we will be
        //asked to provide arguments if our original class constructor has any parameters

        Constructor construct = new Constructor(10, 20);
        Constructor construct2 = new Constructor("Sandy", "Sara");
        Constructor construct3 = new Constructor(40, 60, 70);
        //Constructor construct4= new Constructor();    //If you have declared constructors with parameters,
        // the default constructor cannot be called. But if no other constructors are declared, the default
        // constructor will play its role.


        construct3.toConstruct(10, 12);          //if you have multiple constructors of diff name but same class
        // and you want to call a method of the class, you can call it by any declared constructor name


        System.out.println(construct2.anotherName);
        System.out.println(construct.num1);

    }
}