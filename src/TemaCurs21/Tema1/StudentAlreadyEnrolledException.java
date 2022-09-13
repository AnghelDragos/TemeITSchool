package TemaCurs21.Tema1;

public class StudentAlreadyEnrolledException extends RuntimeException{
    public StudentAlreadyEnrolledException(String message){
        super(message);
    }
}
