package static_Keyword;

public class UseStatic {


    //Static members of the class can but should not be called using an object.
    // They can simply be called using its name or the class name.
    //Only non-static members can be accessed using objects.


    //create 2 global variables

    String name = "Somaya";           //non-static global variable
    static int num = 10;             //static global variable


    public static void main(String[] args) {
        // 2 ways to call a static method
        sum();                //1. by using the method name
        UseStatic.sum();        //2. by using the class name

        // calling static variables
        System.out.println(num);
        System.out.println(UseStatic.num);


        //calling non-static members of class
        //create an object

        UseStatic us = new UseStatic();
        System.out.println(us.name);
        us.sendMail();


    }


    public void sendMail() {                                 //A non-static method
        System.out.println("send us a mail method");
    }

    public static void sum() {                              //A static method
        System.out.println("sum Method");
    }


}
