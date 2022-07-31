package TemaCurs13;

public class Student extends Person {
    int nrOfCourses;
    String[] courses = new String[3]; // 3 elements in total
    int nrOfGrades;
    Grade[] grades=new Grade[10]; // 10 elements in total

    public Student(String name, String address){
        super(name, address);
    }

    void addCourse(String courseName) throws CantAddElementException{
        if(nrOfCourses==3){
            throw new CantAddElementException("Studentul "+name+" are deja 3 cursuri");
        }
        else{
            courses[nrOfCourses]=courseName;
            System.out.println("S-a adaugat cursul " + courseName);
            nrOfCourses++;
        }
    }

    void addCourseGrade(String course, int grade) throws CantAddElementException {
        if(nrOfGrades==10){
            throw new CantAddElementException("Studentul " + name+ " are deja 10 note");
        }
        else{
            grades[nrOfGrades]=new Grade(course,grade);
            nrOfGrades++;
            System.out.println("S-a adaugat nota "+ grade+ " in cursul " + course);
        }
    }

    void printGrades(){
        System.out.print("Notele sunt: ");
        for(Grade c:grades){
            System.out.println(" "+ c);
        }
    }

    void printCourses(){
        System.out.print("Cursurile sunt: ");
        for(String c:courses){
            System.out.print(" "+ c);
        }
    }

    void getAverageGradeForCourse(String course){
        int noteleAdunate=0;
        int numarulDeNote=0;
        for(int i=0; i<nrOfGrades; i++){
            Grade grade = grades[i];
            if(grade.getCourseName().equals(course)){
                noteleAdunate+= grade.getGrade();
                numarulDeNote++;
            }
        }
        System.out.println("Media notelor este: " +  noteleAdunate/numarulDeNote);
    }

    @Override
    public String toString(){
        return "Studentul " + super.name + " cu adresa " + super.address + " este inscris la " + nrOfCourses + " cursuri si are " + nrOfGrades + " note";
    }



    public Grade[] getGrades() {
        return grades;
    }

    public int getNrOfCourses() {
        return nrOfCourses;
    }

    public int getNrOfGrades() {
        return nrOfGrades;
    }

    public String getName(){
        return name;
    }

}
