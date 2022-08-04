package TemaCurs16.Tema1.Problema2;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1,1);
        ComplexNumber b = new ComplexNumber(1,1);
        ComplexNumber c = a;

        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println("----------------");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        System.out.println("Mai jos e hash code");
        System.out.println("a: "+a.hashCode());
        System.out.println("b: "+b.hashCode());
        System.out.println("c: "+c.hashCode());
    }
}
