package TemaCurs17.ExceptionsSlide82;

public class Person {
    int age;
    String name;
    long cnp;

    public Person() {
    }

    public Person(int age, String name, long cnp) {
        this.age = age;
        this.name = name;
        this.cnp=cnp;
    }

    void display(){
        System.out.println("Persoana cu numele "+name+" are varsta "+age + " si CNP-ul: " + cnp);
    }


}
