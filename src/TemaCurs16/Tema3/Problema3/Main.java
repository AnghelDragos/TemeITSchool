package TemaCurs16.Tema3.Problema3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textIntrodus = sc.nextLine();

        String[] arrayDeStringuri = textIntrodus.split(" "); // impartim textul dupa " " spatiu liber

        boolean gasitDuplicat=false;

        for(int i=0; i<arrayDeStringuri.length; i++){
            if(gasitDuplicat){
                break;
            }
            for(int j=i+1; j< arrayDeStringuri.length;j++){
                if(arrayDeStringuri[i].equals(arrayDeStringuri[j])){
                    System.out.println(arrayDeStringuri[i]);
                    gasitDuplicat=true;
                    break;
                }
            }
        }

    }
}
