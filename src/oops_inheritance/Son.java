package oops_inheritance;

import oops_polymorphism.Method_Overloading;

public class Son extends Father {

    @Override
    public void style() {
        System.out.println("Son has no sense of style");
    }


    @Override
    public void snoring() {
        System.out.println("aaaaa");
    }


    public void Engineering() {
        System.out.println("Son is a software engineer");
    }

    @Override
    public void talking() {
        System.out.println("son is taiking");
    }
}


