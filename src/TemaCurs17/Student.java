package TemaCurs17;

public class Student extends Person{
    String facultate;
    double medie;

    public Student(String nume, int varsta, double inaltime){
        super(nume, varsta, inaltime);
    }

    public void setFacultate(String facultate){
        this.facultate=facultate;
    }

    public void setMedie(double medie){
        this.medie=medie;
    }

    @Override
    void afiseaza(){
        System.out.println("Studentul cu numele "+ nume+ " si varsta " + varsta + " are inaltimea " + inaltime+", se duce la facultatea "+facultate+" si are media "+medie);
    }

    @Override
    void maninca(){
        System.out.println("Studentul cu numele "+nume+" mananca zacusca");
    }

}
