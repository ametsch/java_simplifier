/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

/**
 * a class that allows you to use fractions
 */
public class Fraction extends Number{
    private Number numerator, denominator;

    /**
     * constructor from any 2 Number values
     * @param numerator java.lang.Number
     * @param denominator java.lang.Number
     */
    public Fraction(Number numerator, Number denominator){
        super();
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * returns the integer value of the fraction
     * @return int
     */
    @Override
    public int intValue() {
        return (int) (this.numerator.doubleValue()/this.denominator.doubleValue());
    }

    /**
     * returns the long value of the fraction
     * @return long
     */
    @Override
    public long longValue() {
        return (long) (this.numerator.doubleValue()/this.denominator.doubleValue());
    }

    /**
     * returns the float value of the fraction
     * @return float
     */
    @Override
    public float floatValue() {
        return (float) (this.numerator.doubleValue()/this.denominator.doubleValue());
    }

    /**
     * returns the double value of the fraction
     * @return double
     */
    @Override
    public double doubleValue() {
        return this.numerator.doubleValue()/this.denominator.doubleValue();
    }

    /**
     * returns the numerator
     * @return double
     */
    public double getNumerator() {
        return this.numerator.doubleValue();
    }

    /**
     * sets the numerator
     * @param numerator java.lang.Number
     */
    public void setNumerator(Number numerator) {
        this.numerator = numerator;
    }

    /**
     * returns the denominator
     * @return double
     */
    public double getDenominator() {
        return this.denominator.doubleValue();
    }

    /**
     * sets the denominator
     * @param denominator java.lang.Number
     */
    public void setDenominator(Number denominator) {
        this.denominator = denominator;
    }

    /**
     * toString method
     * @return java.lang.String
     */
    @Override
    public String toString(){
        return String.format("%s / %s", this.numerator.toString(), this.denominator.toString());
    }
}
