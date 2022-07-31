package TemaCurs13;

public class Person {
    String name;
    String address;

    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    public String toString(){
        return "Numele persoanei este: "+name+" si adresa este: "+address;
    }
}
