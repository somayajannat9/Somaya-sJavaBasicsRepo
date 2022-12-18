package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {

        //Advantage of arraylist, you can have any number of elements without defining the length.
        // and you can have any type of elements as well

        //To create/use ArrayList methods, you have to import the arraylist class
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(20);

        //To print the size of this arraylist
        System.out.println(arr.size());

        //To add more element to this arraylist
        arr.add(true);
        arr.add("S");

        //To print the new length of this arraylist
        System.out.println(arr.size());

        //To remove a index value
        arr.add(300);
        arr.remove(4);
        System.out.println(arr.size());

        //To find a element at a specific index
        System.out.println(arr.get(3));

        //To print all the elements of the arraylist
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        //To restrict your arraylist to accept only a specific data type
        ArrayList<Integer> arrayL = new ArrayList<Integer>();
        arrayL.add(100);
        arrayL.add(200);
        arrayL.add(300);
        arrayL.add(400);         //No other types but int are allowed in this arraylist.


    }


}
