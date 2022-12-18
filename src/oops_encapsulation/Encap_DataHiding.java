package oops_encapsulation;

public class Encap_DataHiding {

    //Oops, concept ENCAPSULATION is data hiding.
    private int ssn = 28329498;     // make the variable private.
    private int dob = 34893483;

    private String name = "Som";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encap_DataHiding obj = new Encap_DataHiding();
        obj.setName("Rem");
        String a = obj.getName();
        System.out.println(a);
    }

    public int getSsn() {        // In any case you need to access the value, make a getter method.
        return ssn;
    }


    public void setSsn(int value) {      // In any case you need to change the value, make a setter method.
        ssn = value;
    }


}

