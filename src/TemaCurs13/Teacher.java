package TemaCurs13;

public class Teacher extends Person{
    int nrOfCourses;
    String[] courses = new String[3]; // 3 elements in total

    public Teacher(String name, String address){
        super(name, address);
    }

    void addCourse(String course) throws CantAddElementException{
        if(nrOfCourses==3){
            throw new CantAddElementException("Profesorul " + name + " nu poate avea mai mult de 3 cursuri");
        }
        else{
            courses[nrOfCourses]=course;
            System.out.println("s-a adaugat cursul "+ course+ " pentru profesorul " + name);
            nrOfCourses++;
        }
    }

    void printCourses(){
        System.out.println("Cursurile profesorului " + name + " sunt:");
        for(String c: courses){
            System.out.print(" " + c);
        }
    }


    @Override
    public String toString(){
        return "Numele persoanei este: "+name+" si adresa este: "+address + " si numarul de cursuri este: " + nrOfCourses;

    }
}
