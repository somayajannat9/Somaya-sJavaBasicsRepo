package constructorConcept;

public class B extends A {


    B() {
        System.out.println("This is the constructor for the B class");

    }

    // another way to call parent class constructor is by the use of "super" key word.
    B(int a) {
        super("lol");                  // super calls a constructor from the parent class.super should be the
        // first statement in any particular constructor body.
        System.out.println("B constructor");    // if want to access another parent class constructor, then create another
        // child class constructor, then use the super keyword.
    }

    public static void main(String[] args) {
        B obj = new B();                     //Since class B extended from class A, when we print the constructor for
        //class B, class A's default constructor will first print then, B.
        A obj2 = new A(10, 20);          // if the parent class has other constructors then they will print later after B.

        B obj3 = new B(10);


    }
}
