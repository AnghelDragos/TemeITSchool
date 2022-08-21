package TemaCurs17.ExceptionsSlide82;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Person pNull = new Person();
        pNull.display();
        Person p2 = new Person();

        Person[] arrPersoane1 = new Person[3];
        arrPersoane1[0] = pNull;
        arrPersoane1[1] = p2;

//    calculeazaVarstaMedie(arrPersoane1);

        Person personCuCNP = new Person(20, "PersonName", 1234567891234L);
        verificareNumarDeCaractereInCnp(personCuCNP);
        arrPersoane1[2] = personCuCNP;
        personCuCNP.display();
        calculeazaVarstaMedie(arrPersoane1);

        Random r = new Random();
        Person[] array2 = new Person[5];
//    for(int i=0; i<array2.length; i++){
//        array2[i]=new Person((r.nextInt(100)),"acelasi nume tuturor",1234567891234L); // varsta intre 1 si 100
//        System.out.println(array2[i]);
//        System.out.println(array2[i].age);
//    }
//        calculeazaVarstaMedie(array2);
    }

    static void verificareNumarDeCaractereInCnp(Person p) throws IncorrectCNPException{
        int length = String.valueOf(p.cnp).length();
        if(length<13){
            throw new IncorrectCNPException("CNP-ul introdus nu contine 13 caractere");
        }
    }

    static void calculeazaVarstaMedie(Person[] p) {
        int varstaAdunata = 0;
        int counterNumarPersoane = 0;
        for (int i = 0; i < p.length; i++) {
            counterNumarPersoane++;
            varstaAdunata += p[i].age;
        }

        int medieVarsta = 0;
        try {
            medieVarsta = varstaAdunata / counterNumarPersoane;
            System.out.println("Varsta medie a persoanelor este: " + medieVarsta);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

}
