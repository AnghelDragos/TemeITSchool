package TemaCurs17.Interfete;

public interface I1 {
    void simpleMethod();
    String complexMethod(String input);

    default void defaultMethod(){
        System.out.println("Default method in I1 executed");
    }

}
