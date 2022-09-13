package TemaCurs21.Tema1;

public class Main {
    public static void main(String[] args) {
        Catalog catalog1 = new Catalog();
        Student student1 = new Student("a",10);
        Student student2 = new Student("b",9);
        Student student3 = new Student("c",8);
        Student student4 = new Student("d",7);
        Student student5 = new Student("e",6);
        catalog1.addStudent(student1);
        catalog1.addStudent(student2);
        catalog1.addStudent(student3);
        catalog1.addStudent(student4);
        catalog1.addStudent(student5);

        //catalog1.addStudent(student1); // arunca exceptie

        catalog1.removeStudent(student1);
        //catalog1.removeStudent(student1); // arunca exceptie

        catalog1.printGrades();

        catalog1.findStudent(student5);

    }
}
