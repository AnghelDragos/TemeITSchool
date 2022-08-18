package TemaCurs17.Mostenire;

public class Dreptunghi extends FormaGeometrica{
    int lungime;
    int latime;
    int raza;

    public Dreptunghi(int lungime, int latime){
        this.lungime=lungime;
        this.latime=latime;
    }

    void getArie(){
        System.out.println("Aria dreptunghiului este: " + (lungime*latime));
    }

    void getPerimetru(){
        System.out.println("Perimetrul dreptunghiului este: " + 2*(lungime+latime));
    }
}
