package TemaCurs16.Tema1.Problema1;

public class Time {
    long milliSeconds = System.currentTimeMillis();
    long seconds = (milliSeconds / 1000) % 60;
    long minutes = ((milliSeconds / 1000) / 60) % 60;
    long hours = ((milliSeconds /( 1000 * 60 * 60)) % 24);


    @Override
    public String toString(){
        return(hours+":"+minutes+":"+seconds);
    }

}
