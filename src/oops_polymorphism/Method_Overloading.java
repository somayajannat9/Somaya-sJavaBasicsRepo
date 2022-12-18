package oops_polymorphism;

public class Method_Overloading {
    public static void main(String[] args) {
        //Method_Overloading obj = new Method_Overloading();
//        System.out.println(obj.sub(3, 4, 5));
//        System.out.println(obj.sub(4, 6, "Som"));

        String m = "Somaya";
        char[] array = m.toCharArray();

        for (int i = m.length() - 1; i >= 0; i--) {
            System.out.print(array[i]);

            Method_Overloading.sub(2, 2);


        }
    }


    //Opp, Compile time polymorphism, method overloading is having the same method name but different
    // number of parameters, data type of the parameters, and order of parameters.


    //With overloading you have a function with different sets of parameters. The function that is executed is
    // determined using the number and type of the parameters you provide.

    public static int sub(int num1, int num2) {           // we have a method that takes 2 parameters and both are int.
        return num1 - num2;
    }


    public int sub(int num1, int num2, int num3) {      // we have another method using the same name
        return num1 - num2 - num3;                        // but it is different because it takes 3 parameters.
    }

    public String sub(int num1, int num2, String str) {      // we have another method using the same name but its with
        return num1 - num2 + str;                               //different types of parameters.
    }

    public String sub(String str, int num1, int num2) {      // we have another method using the same name and number of
        // parameters but this has different order of parameters.
        return str + (num1 - num2);
    }


    public String sub(int a, String str, String str1, String str2) {
        return str + str1;

    }

    public String sub(String whatever, String whatever2, String whatever3, int a) {
        return whatever + whatever2;
    }
}


// arguments vs.Parameters= we give arguments when we call a method in place of the parameters,
// we give parameters when we create the method.