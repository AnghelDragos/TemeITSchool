package TemaCurs16.Tema3.Problema5;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        sb1.append("util");
        sb1.append(" package");
        sb1.insert(0,"java.");
        sb1.append(" este pachetul importat automat");
        sb1.replace(5,9,"lang");
        sb1.insert(17,",");

        System.out.println(sb1);


    }
}
