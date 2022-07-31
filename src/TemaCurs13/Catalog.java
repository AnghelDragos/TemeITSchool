package TemaCurs13;

public class Catalog implements AutoCloseable{
    public Catalog(){
        System.out.println("Catalogul a fost creat");
    }

    public void scrieNote(Student student, String course) throws InvalidGradeException{
        for(int i = 0;i<student.getNrOfGrades(); i++){
            Grade grade = student.getGrades()[i];
            if(grade.getGrade()<1 || grade.getGrade()>10){
                throw new InvalidGradeException("Nota pentru cursul " + grade.getCourseName() + " este " + grade.getGrade());
            }
            if(grade.getCourseName().equals(course)){
                System.out.println("Student " + student.getName() + ", cursul: "+grade.getCourseName() + ", nota: " + grade.getGrade());
            }

        }
    }



    @Override
    public void close(){
        System.out.println("Catalogul a fost inchis");
    }



}
