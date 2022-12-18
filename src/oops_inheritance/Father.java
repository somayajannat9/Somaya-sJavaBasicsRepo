package oops_inheritance;

import java.sql.SQLOutput;

public class Father extends GrandFather {

    public void stuttering() {                  // we take the method from the superclass.
        System.out.println("MMy nnname is Bbbrad");          // we changed our functions within the same method.
    }

    public void contractor() {
        System.out.println("My father works as a contractor");        // this is the sub classe's own method.
    }

    public void talking() {
        System.out.println("father is talking");
    }
}
