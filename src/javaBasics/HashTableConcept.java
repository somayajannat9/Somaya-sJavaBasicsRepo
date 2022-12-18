package javaBasics;

import constructorConcept.A;

import java.util.Hashtable;

public class HashTableConcept {
    public static void main(String[] args) {

        // A hashtable stores values in keys, the keys can be either string or int and the value also can be string or int.
        //Like arraylist, hashtable also does not define a length.

        //To create a hashtable
        Hashtable hashtable = new Hashtable<>();
        hashtable.put("A", "Test");
        hashtable.put("b", 5);            //you need use the put method to put any key and any value.
        hashtable.put("C", 6);

        //To print the length
        System.out.println(hashtable.size());

        //To get whats the value in a specific key
        System.out.println(hashtable.get("A"));

        //To restrict the hashtable to have int key and int value
        Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
        hash.put(1, 100);
        hash.put(2, 200);

        Hashtable<Integer, String> hashT = new Hashtable<Integer, String>();
        hashT.put(1, "S");
        hashT.put(2, "d");

    }
}
