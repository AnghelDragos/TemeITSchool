package TemaCurs16.Tema1.Problema2;

import java.util.Objects;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber(double re, double im){
        this.re = re;
        this.im= im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber complexNumber1 = (ComplexNumber) o;
        return  this.re==complexNumber1.getRe() && this.im == complexNumber1.getIm();
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
