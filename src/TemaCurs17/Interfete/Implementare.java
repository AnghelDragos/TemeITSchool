package TemaCurs17.Interfete;

public class Implementare implements I1,I2{

    @Override
    public void simpleMethod(){
        System.out.println("Simple method");
    }

    @Override
    public String complexMethod(String input){
        System.out.println("Complex method has the following input: " + input);
        return input;
    }

    @Override
    public void defaultMethod() {
        I1.super.defaultMethod();
    }

    @Override
    public void method(){
        System.out.println("Metoda este executata, suprascrisa in clasa Implementare");
    }


}
