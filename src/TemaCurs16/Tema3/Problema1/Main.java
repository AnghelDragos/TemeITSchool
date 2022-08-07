package TemaCurs16.Tema3.Problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    System.out.println("Scrieti Start si apasati enter pentru a incepe");
    String cuvantIntrodus1 = sc.nextLine();
    while(!cuvantIntrodus1.equalsIgnoreCase("START")){
        System.out.println("Te rog introdu START pentru a începe");
        cuvantIntrodus1=sc.nextLine();
    }

    while(!cuvantIntrodus1.equalsIgnoreCase("EXIT")) {
        String[] comenzi = cuvantIntrodus1.split(" ");
        switch (comenzi[0]) {
            case "ADD": {
                System.out.println("Introduceti brandul si pretul masinii si apasati enter");
                String cuvantIntrodus2 = sc.nextLine();
                String[] comenzi2 = cuvantIntrodus2.split(" ");
                Masina masina=new Masina(comenzi2[0],Integer.parseInt(comenzi2[1]));
                masina.addBrandPret(masina);
                break;
            }
            case "DISPLAY_ALL": {
                Masina.displayAll();
                break;
            }
            case "DISPLAY_UNDER": {
                System.out.println("Introduceti pretul pentru a afisa masinile cu pretul mai mic");
                int pretIntrodus = sc2.nextInt();
                Masina.displayUnder(pretIntrodus);
                break;
            }
            case "DISPLAY_BRAND": {
                System.out.println("Introduceti brandul masinii cautate");
                String brandIntrodus=sc.nextLine();
                Masina.displayBrand(brandIntrodus);
                break;
            }


        }//sfarsit switch
        System.out.println("Introduceti una din comenzile disponibile: ADD, DISPLAY_ALL, DISPLAY_UNDER, DISPLAY_BRAND, EXIT");
        cuvantIntrodus1 = sc.nextLine();

    }//sfarsit while
        System.out.println("Fabrica s-a oprit!");
    }
}
