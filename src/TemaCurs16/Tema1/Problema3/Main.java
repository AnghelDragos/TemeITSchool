package TemaCurs16.Tema1.Problema3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(Random(1,5));

    }


    public static int Random(int a, int b){
        Random rn = new Random();
        return rn.nextInt(b-a)+a;
    }

}



