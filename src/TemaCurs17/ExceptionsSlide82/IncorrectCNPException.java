package TemaCurs17.ExceptionsSlide82;

public class IncorrectCNPException extends RuntimeException{
    public IncorrectCNPException(String s){
        System.out.println(s);
    }
}
