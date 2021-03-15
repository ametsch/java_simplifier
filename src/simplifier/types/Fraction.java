/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

public class Fraction extends Number{
    private double numerator, denominator;

    public Fraction(double numerator, double denominator){
        super();
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int intValue() {
        return (int) (this.numerator/this.denominator);
    }

    @Override
    public long longValue() {
        return (long) (this.numerator/this.denominator);
    }

    @Override
    public float floatValue() {
        return (float) (this.numerator/this.denominator);
    }

    @Override
    public double doubleValue() {
        return this.numerator/this.denominator;
    }

    public double getNumerator() {
        return this.numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return this.denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public String toString(){
        return String.format("%f / %f", this.numerator, this.denominator);
    }
}
