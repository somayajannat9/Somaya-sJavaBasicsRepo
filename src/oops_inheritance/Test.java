package oops_inheritance;

public class Test {

    public static void main(String[] args) {
        Father father = new Father();
        father.stuttering();                 // this is how we call and test a method.
        father.talking();
        System.out.println(father.age);      // this is how we call and test an attribute.

        Son obj = new Son();
        obj.talking();
        obj.stuttering();

        GrandSon obj2 = new GrandSon();
        obj2.talking();


    }
}
