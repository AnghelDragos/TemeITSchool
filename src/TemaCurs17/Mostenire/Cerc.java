package TemaCurs17.Mostenire;
import java.lang.Math.*;
public class Cerc extends FormaGeometrica{
    int lungime;
    int latime;
    int raza;

    public Cerc (int raza){
        this.raza=raza;
    }

    void getArie(){
        System.out.println("Aria cercului este: " +  (Math.PI* raza*raza));
    }

    void getPerimetru(){
        System.out.println("Perimetrul cercului este: "+ (Math.PI* 2*raza));
    }
}
