package TemaCurs16.Tema2.Problema3;

import java.util.Scanner;

import static java.lang.Math.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Va rugăm sa alegeți clasic sau avansat.");
        String alegereIntrodusa = sc.nextLine();

        Scanner scannerNumere = new Scanner (System.in);

        boolean hasRun=false;

        while(!alegereIntrodusa.equalsIgnoreCase("stop")) {
            if (alegereIntrodusa.equalsIgnoreCase("clasic")) {
                System.out.println("Operatiile disponibile sunt: suma, diferenta, min, max. Introduceti operatia dorita");
                alegereIntrodusa = sc.nextLine();

                while(!alegereIntrodusa.equalsIgnoreCase("suma")&& !alegereIntrodusa.equalsIgnoreCase("diferenta")
                        && !alegereIntrodusa.equalsIgnoreCase("min") && !alegereIntrodusa.equalsIgnoreCase("max")){
                    System.out.println("Aceasta operatie nu exista. Introduceti iarasi operatia");
                    alegereIntrodusa = sc.nextLine();
                }
                    switch(alegereIntrodusa){
                        case "suma": {
                            System.out.println("Introduceti primul numar");
                            int numarUnu = scannerNumere.nextInt();
                            System.out.println("Introduceti al doilea numar");
                            int numarDoi = scannerNumere.nextInt();
                            System.out.println("Suma numerelor este: "+ (numarUnu+numarDoi));
                            hasRun=true;
                            break;
                        }
                        case "diferenta": {
                            System.out.println("Introduceti primul numar");
                            int numarUnu = scannerNumere.nextInt();
                            System.out.println("Introduceti al doilea numar");
                            int numarDoi = scannerNumere.nextInt();
                            System.out.println("Diferenta numerelor este: "+ (numarUnu-numarDoi));
                            hasRun=true;
                            break;
                        }
                        case "min": {
                            System.out.println("Introduceti primul numar");
                            int numarUnu = scannerNumere.nextInt();
                            System.out.println("Introduceti al doilea numar");
                            int numarDoi = scannerNumere.nextInt();
                            System.out.println("Cel mai mic numar este: "+ min(numarUnu,numarDoi));
                            hasRun=true;
                            break;
                        }
                        case "max": {
                            System.out.println("Introduceti primul numar");
                            int numarUnu = scannerNumere.nextInt();
                            System.out.println("Introduceti al doilea numar");
                            int numarDoi = scannerNumere.nextInt();
                            System.out.println("Cel mai mare numar este: "+ max(numarUnu,numarDoi));
                            hasRun=true;
                            break;
                        }
                    }

            } else if (alegereIntrodusa.equalsIgnoreCase("avansat")) {
                System.out.println("Operatiile disponibile sunt: radical, modul, putere. Introduceti operatia dorita");
                alegereIntrodusa = sc.nextLine();
                while(!alegereIntrodusa.equalsIgnoreCase("radical")&& !alegereIntrodusa.equalsIgnoreCase("modul")
                        && !alegereIntrodusa.equalsIgnoreCase("putere")){
                    System.out.println("Aceasta operatie nu exista. Introduceti iarasi operatia");
                    alegereIntrodusa = sc.nextLine();
                }

                switch(alegereIntrodusa){
                    case "radical":{
                        System.out.println("Introduceti numarul si apasati enter");
                        int numarIntrodus = scannerNumere.nextInt();
                        System.out.println("Radicalul numarului introdus este: "+sqrt(numarIntrodus));
                        hasRun=true;
                        break;
                    }
                    case "modul":{
                        System.out.println("Introduceti numarul si apasati enter");
                        int numarIntrodus = scannerNumere.nextInt();
                        System.out.println("Modulul numarului introdus este: "+abs(numarIntrodus));
                        hasRun=true;
                        break;
                    }
                    case "putere":{
                        System.out.println("Introduceti numarul 1 si apasati enter");
                        int numarIntrodus1 = scannerNumere.nextInt();
                        System.out.println("Introduceti numarul 2 si apasati enter");
                        int numarIntrodus2 = scannerNumere.nextInt();
                        System.out.println("Numarul "+numarIntrodus1+" ridicat la puterea "+ numarIntrodus2+" este: "+ pow(numarIntrodus1,numarIntrodus2));
                        hasRun=true;
                        break;
                    }
                }

            } else {
                System.out.println("Tipul introdus nu este valid, va rugam introduceti iarasi tipul");
                alegereIntrodusa = sc.nextLine();
            }


            if (hasRun==true){
                System.out.println("Programul incepe iarasi, va rugăm sa alegeți clasic sau avansat. Daca vreti sa il opriti, introduceti 'Stop'");
                alegereIntrodusa = sc.nextLine();
                hasRun=false;
            }


//           System.out.println("Programul incepe iarasi, va rugăm sa alegeți clasic sau avansat. Daca vreti sa il opriti, introduceti 'Stop'");
//            alegereIntrodusa = sc.nextLine();
//            hasRun=false;



        }
    }
}
