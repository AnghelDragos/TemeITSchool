package TemaCurs13;

public class Main {
    public static void main(String[] args) {
    Student s1 = new Student("Student1", "Adresa studentului 1");

    try{
        s1.addCourse("Curs0");
    }
    catch(CantAddElementException e){
        System.out.println(e.getMessage());
    }

    try{
        s1.addCourse("Curs1");
    }
    catch(CantAddElementException e){
        System.out.println(e.getMessage());
    }

        try{
            s1.addCourse("Curs2");
        }
        catch(CantAddElementException e){
            System.out.println(e.getMessage());
        }

        try{
            s1.addCourse("Curs 3");
        }
        catch(CantAddElementException e){
            System.out.println(e.getMessage());
        }


        try{
            s1.addCourseGrade("Curs1",5);
        }
        catch(CantAddElementException e){
            System.out.println(e.getMessage());
        }

        try{
            s1.addCourseGrade("Curs1",7);
        }
        catch(CantAddElementException e){
            System.out.println(e.getMessage());
        }

        s1.getAverageGradeForCourse("Curs1");

        System.out.println(s1.toString());

        Teacher t1 = new Teacher("Teacher1", "Teacher Address 1");

        try{
            t1.addCourse("curs 1");
        }
        catch(CantAddElementException e){
            System.out.println(e.getMessage());
        }

        try{
            t1.addCourse("curs 2");
        }
        catch(CantAddElementException e){
            System.out.println(e.getMessage());
        }

        try{
            t1.addCourse("curs3");
        }
        catch(CantAddElementException e){
            System.out.println(e.getMessage());
        }

        try{
            t1.addCourse("curs4");
        }
        catch(CantAddElementException e){
            System.out.println(e.getMessage());
        }

    }
}
