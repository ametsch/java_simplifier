/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

public class Fraction extends Number{
    private Number numerator, denominator;

    public Fraction(Number numerator, Number denominator){
        super();
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int intValue() {
        return (int) (this.numerator.doubleValue()/this.denominator.doubleValue());
    }

    @Override
    public long longValue() {
        return (long) (this.numerator.doubleValue()/this.denominator.doubleValue());
    }

    @Override
    public float floatValue() {
        return (float) (this.numerator.doubleValue()/this.denominator.doubleValue());
    }

    @Override
    public double doubleValue() {
        return this.numerator.doubleValue()/this.denominator.doubleValue();
    }

    public double getNumerator() {
        return this.numerator.doubleValue();
    }

    public void setNumerator(Number numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return this.denominator.doubleValue();
    }

    public void setDenominator(Number denominator) {
        this.denominator = denominator;
    }

    public String toString(){
        return String.format("%f / %f", this.numerator.doubleValue(), this.denominator.doubleValue());
    }
}
