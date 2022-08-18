package TemaCurs17;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.inceremnteazaVarsta();
        p.incrementeazaVarsta(25);
        p.print();
        p.esteMajor();
        p.maninca();

        Person p2 = new Person("abc",10,1.80);
        p2.inceremnteazaVarsta();
        p2.print();
        p2.esteMajor();
        p2.maninca();

        Person.afiseazaStatic();

        Student s1 = new Student("Andrei",25,8.0);
        s1.maninca();

        Person p3 = new Student("Nume3",26,9.0);
        Student s2 = new Student("Nume4",25,7.0);

        p3.maninca();
        s2.maninca();


    }


}
