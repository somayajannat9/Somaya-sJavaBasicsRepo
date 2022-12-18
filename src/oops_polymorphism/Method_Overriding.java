package oops_polymorphism;

public class Method_Overriding extends Method_Overloading {

    //Oops, runtime polymorphism is method overriding

    @Override
    public int sub(int num1, int num, int num3) {
        return sub(8, 10, 20);
    }

    public static void main(String[] args) {


        Method_Overloading.sub(3, 9);


        System.out.println(Method_Overloading.sub(2, 7));


        Method_Overloading obj = new Method_Overloading();

        System.out.println(obj.sub("Fruits", 6, 8));

    }


}






