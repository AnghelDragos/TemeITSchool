package TemaCurs16.Tema3.Problema2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un text");
        String textIntrodus = sc.nextLine();
        textIntrodus=textIntrodus.toLowerCase();
        String[] arrayDeStringuri = textIntrodus.split("");
        arrayDeStringuri[0]=arrayDeStringuri[0].toUpperCase();

        for(int i=0; i< arrayDeStringuri.length; i++){
            System.out.print(arrayDeStringuri[i]);
        }

        System.out.println("");
        System.out.println("Rezolvare alternativa:");
        String output = textIntrodus.substring(0,1).toUpperCase() + textIntrodus.substring(1).toLowerCase();
        System.out.println(output);

    }
}
