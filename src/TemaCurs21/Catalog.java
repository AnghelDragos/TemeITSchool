package TemaCurs21;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List <Student> studenti = new ArrayList<>();

    public void addStudent(Student student){
        if(!studenti.contains(student)){
            studenti.add(student);
        }
        else{
            throw new StudentAlreadyEnrolledException("Studentul este inregistrat deja");
        }

    }

    public void removeStudent(Student student){
        if(studenti.contains(student)){
            studenti.remove(student);
            System.out.println("Studentul a fost sters");
        }
        else{
            throw new StudentNotFoundException("Studentul este deja sters");
        }

    }

    public void printGrades(){
        System.out.print("Grades: ");
        for(Student elem:studenti){
            System.out.print(elem.getGrade()+" ");
        }
        System.out.println();//printam pentru a trimite cursorul un rand mai jos
    }

    public void findStudent(Student student){
        if(studenti.contains(student)){
            System.out.println(student);
        }
        else{
            System.out.println("Student not found");
        }
    }




}
