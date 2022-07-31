package TemaCurs13;

public class Grade {
    String courseName;
    int grade;

    public Grade(String courseName,int grade){
    this.courseName=courseName;
    this.grade=grade;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getGrade(){
        return grade;
    }
}
