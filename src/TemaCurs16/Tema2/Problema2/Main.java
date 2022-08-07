package TemaCurs16.Tema2.Problema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ghiceste cate litere ai scris!");
        System.out.println("Poti începe sa scrii");
        int numarulDeCaractereIntrodus = 0;
        String cuvantScris = sc.nextLine();

        while(!cuvantScris.equalsIgnoreCase("STOP")){
            numarulDeCaractereIntrodus+=cuvantScris.length();
            cuvantScris = sc.nextLine();
        }

        System.out.println("Cate caractere crezi ca ai introdus? Scrie un numar si apasa enter");
        int numarulDeCaractereGhicit=0;
        try {
            numarulDeCaractereGhicit = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Nu ati introdus un numar");
            System.exit(0);
        }


        if(numarulDeCaractereIntrodus>numarulDeCaractereGhicit){
            System.out.println("De fapt, ai scris mai mult cu " +(numarulDeCaractereIntrodus-numarulDeCaractereGhicit)+ " caractere. Ai scris in total " +numarulDeCaractereIntrodus+ " caractere");
        }
        else if(numarulDeCaractereIntrodus<numarulDeCaractereGhicit){
            System.out.println("De fapt, ai scris mai putin cu " +(numarulDeCaractereGhicit-numarulDeCaractereIntrodus)+ " caractere. Ai scris in total " +numarulDeCaractereIntrodus+ " caractere");
        }
        else{
            System.out.println("Felicitari, ai ghicit!");
        }

    }
}
