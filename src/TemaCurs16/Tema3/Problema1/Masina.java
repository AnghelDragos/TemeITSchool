package TemaCurs16.Tema3.Problema1;

import java.util.Arrays;
import java.util.Objects;

public class Masina {
    String brand;
    int pret;
    static Masina[] arrayMasini = new Masina[5];

    public Masina(String brand, int pret){
        this.brand=brand;
        this.pret=pret;
    }

    public void addBrandPret(Masina masina){
        boolean locLiberInArray=false;
        for(int i=0; i< arrayMasini.length; i++){
            if(arrayMasini[i]==null){
                locLiberInArray=true;
                System.out.println("Masina " + masina.brand+ " cu pretul " +masina.pret+ " a fost adaugata cu succes");
                arrayMasini[i]=masina;
                break;
            }
        }
        if(locLiberInArray==false){
            System.out.println("Fabrica este plina!");
        }
    }

    public static void displayAll(){
        for(int i=0; i< arrayMasini.length; i++){
            if(arrayMasini[i]!=null){
                System.out.println(arrayMasini[i]);
            }

        }
    }

    public static void displayUnder(int pret){
        boolean suntGasiteMasiniCuPretMaiMic=false;
        for(int i=0; i< arrayMasini.length; i++){
            if(arrayMasini[i]!=null){
                if(arrayMasini[i].pret<pret){
                    suntGasiteMasiniCuPretMaiMic=true;
                    System.out.println(arrayMasini[i]);
                }
            }
        }
        if(suntGasiteMasiniCuPretMaiMic==false){
            System.out.println("Nu s-au gasit masini cu pretul mai mic decat cel specificat");
        }
    }

    public static void displayBrand(String brand){
        boolean brandGasit=false;
        for(int i=0; i< arrayMasini.length; i++){
            if(arrayMasini[i]!=null){
                if(arrayMasini[i].brand.equalsIgnoreCase(brand)){
                    brandGasit=true;
                    System.out.println(arrayMasini[i]);
                }
            }

        }
        if(brandGasit==false){
            System.out.println("Brandul cautat nu se afla in lista");
        }
    }

    @Override
    public String toString() {
        return "Masina{" +
                "brand='" + brand + '\'' +
                ", pret=" + pret +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Masina masina = (Masina) o;
        return pret == masina.pret && Objects.equals(brand, masina.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, pret);
    }
}
