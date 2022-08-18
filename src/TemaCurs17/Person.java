package TemaCurs17;

public class Person {
    String nume;
    int varsta;
    double inaltime;

    public Person() {
        this("Nume default", 0, 0.0);
    }

    public Person(String nume, int varsta, double inaltime) {
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
    }

    public void inceremnteazaVarsta(){
        varsta++;
    }

    public void incrementeazaVarsta(int nr){
        varsta=varsta+nr;
    }

    public void print(){
        System.out.println("Persoana cu numele "+ nume+ " si varsta " + varsta + " are inaltimea " + inaltime);
    }

    public boolean esteMajor(){
        if(varsta>=18){
            return true;
        }
        return false;
    }

    public boolean areVarsta(int varsta){
        if(this.varsta==varsta){
            System.out.println("Are aceiasi varsta");
            return true;
        }
        System.out.println("Nu are areiasi varsta");
        return false;
    }

    public static void afiseazaStatic(){
        System.out.println("Numele clasei este Person");
    }

    public String getName(){
        return nume;
    }
    public void setName(String nume){
        this.nume = nume;
    }

    public int getVarsta(){
        return varsta;
    }
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }

    void afiseaza(){ // lafel ca si metoda print();
        System.out.println("Persoana cu numele "+ nume+ " si varsta " + varsta + " are inaltimea " + inaltime);
    }

    void maninca(){
        System.out.println("Persoana cu numele "+nume+" mananca");
    }

}
