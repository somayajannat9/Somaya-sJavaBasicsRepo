package javaBasics;

import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
        //How to create an array in different ways.
//Java array is a data structure where we can store the elements of the same data type. The elements of an
// array are stored in a contiguous memory location. So, we can store a fixed set of elements in an array.
        int[] array = new int[4];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;

        //To print an array length
        System.out.println(array.length);
        //To print an array element
        System.out.println(array[1]);
        //To print all values from an array
        for (int i = 0; i < array.length; i++) {      //int i= 0(index), as long as i= 4(array length), keep iterating i.
            System.out.println(array[i]);            //print the value of the array index i for each iteration
        }


        int[][] i = {{1, 2, 3, 4}, {5, 6, 7}, {10, 19}};
    }


}
