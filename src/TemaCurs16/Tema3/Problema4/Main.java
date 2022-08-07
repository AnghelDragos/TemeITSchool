package TemaCurs16.Tema3.Problema4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textIntrodus = sc.nextLine();
        String[] arrayDeStringuri = textIntrodus.split(" ");

        StringBuilder sb1 = new StringBuilder();
        sb1.append(textIntrodus);
        System.out.println("Cuvantul introdus initial este: " + sb1);


        StringBuilder sb2 = new StringBuilder();
        for(int i=sb1.length()-1; i>=0; i--){
            sb2.append(sb1.charAt(i));
        }
        System.out.println("Cuvantul scris cu literele invers: " + sb2);



        boolean litereGasiteCareNuSuntEgale=false;
        for(int i=0;i<sb1.length();i++){
            if(sb1.charAt(i)!=sb2.charAt(i)){
                litereGasiteCareNuSuntEgale=true;
            }
        }


        if(litereGasiteCareNuSuntEgale==false){
            System.out.println("Cuvantul este palindrom");
        }
        else{
            System.out.println("Cuvantul nu este palindrom");
        }


    }
}
