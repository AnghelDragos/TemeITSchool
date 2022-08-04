package TemaCurs16.Tema1.Problema4;
import java.util.Random;


public class GhicesteNumar {

    int a=0;
    int b=100;
    int numarGenerat = ghicesteNumar(a,b);
    int counter =0;
    public GhicesteNumar(int numarDeGhicit){
        while(numarGenerat!=numarDeGhicit){
            System.out.println("“Numărul generat este " + numarGenerat);
            if(numarGenerat>numarDeGhicit){
                numarGenerat = ghicesteNumar(a,numarGenerat);
                counter++;
            }
            else if(numarGenerat<numarDeGhicit){
                numarGenerat = ghicesteNumar(numarGenerat+1,b);
                counter++;
            }
        }
        System.out.println("Ai ghicit numarul " + numarGenerat);
        System.out.println("Numarul de incercari pentru a ghici numarul este: " + counter);
    }


    public static int ghicesteNumar(int a, int b){
        Random rn = new Random();
        return rn.nextInt(b-a)+a;
    }



}
