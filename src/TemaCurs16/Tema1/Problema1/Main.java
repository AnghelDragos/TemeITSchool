package TemaCurs16.Tema1.Problema1;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println(time1.toString());

        System.out.println();
        System.out.println("Alta rezolvare folosind java.time.LocalTime:");
        System.out.println(LocalTime.now());


    }
}
