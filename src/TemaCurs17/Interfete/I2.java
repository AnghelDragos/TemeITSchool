package TemaCurs17.Interfete;

public interface I2 {
    void method();
    static void showInfo(){
        System.out.println("Info is shown");
    }

    default void defaultMethod() {
        System.out.println("Default method in I2");
    }

}
