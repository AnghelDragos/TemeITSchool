package TemaCurs16.Tema2.Problema1;

import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Scrie START pentru a incepe!");
        String cuvantScris1 = c.nextLine();
        while(!cuvantScris1.equalsIgnoreCase("start")){
            System.out.println("Scrie START pentru a incepe!");
            cuvantScris1 = c.nextLine();
        }

        System.out.println("Acum poti incepe sa scrii iar programul iti va calcula timpul total, dar si media pe litera");
        long timpulDeIncepere = System.currentTimeMillis();
        cuvantScris1 = c.nextLine();
        long timpulDeTerminare = System.currentTimeMillis();
        System.out.println("Timpul total a fost " + (timpulDeTerminare-timpulDeIncepere) +  " milisecunde,");
        System.out.println(" ai scris " + cuvantScris1.length() + " caractere");
        System.out.println(", iar media de timp pentru un caracter a fost: " + (timpulDeTerminare-timpulDeIncepere)/cuvantScris1.length() + " milisecunde");
        System.out.println("Vrei sa mai incerci o data?");
        cuvantScris1 = c.nextLine();

        while(cuvantScris1.equalsIgnoreCase("DA")){
            System.out.println("Introduce un cuvant si apasa enter");
            timpulDeIncepere = System.currentTimeMillis();
            cuvantScris1 = c.nextLine();
            timpulDeTerminare = System.currentTimeMillis();
            System.out.println("Timpul total a fost " + (timpulDeTerminare-timpulDeIncepere) +  " milisecunde,");
            System.out.println(" ai scris " + cuvantScris1.length() + " caractere");
            System.out.println(", iar media de timp pentru un caracter a fost: " + (timpulDeTerminare-timpulDeIncepere)/cuvantScris1.length() + " milisecunde");
            System.out.println("Vrei sa mai incerci o data?");
            cuvantScris1 = c.nextLine();
        }






    }

}
