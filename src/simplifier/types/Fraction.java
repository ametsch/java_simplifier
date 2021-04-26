/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


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
     * @param numerator {@code java.lang.Number}
     * @param denominator {@code java.lang.Number}
     */
    public Fraction(Number numerator, Number denominator){
        super();
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * returns the {@code int} value of the fraction
     * @return {@code int}
     */
    @Override
    public int intValue() {
        return (int) (this.numerator.doubleValue()/this.denominator.doubleValue());
    }

    /**
     * returns the {@code long} value of the fraction
     * @return {@code long}
     */
    @Override
    public long longValue() {
        return (long) (this.numerator.doubleValue()/this.denominator.doubleValue());
    }

    /**
     * returns the {@code float} value of the fraction
     * @return {@code float}
     */
    @Override
    public float floatValue() {
        return (float) (this.numerator.doubleValue()/this.denominator.doubleValue());
    }

    /**
     * returns the {@code double} value of the fraction
     * @return {@code double}
     */
    @Override
    public double doubleValue() {
        return this.numerator.doubleValue()/this.denominator.doubleValue();
    }

    /**
     * returns the numerator
     * @return {@code double}
     */
    public double getNumerator() {
        return this.numerator.doubleValue();
    }

    /**
     * sets the numerator
     * @param numerator {@code java.lang.Number}
     */
    public void setNumerator(Number numerator) {
        this.numerator = numerator;
    }

    /**
     * returns the denominator
     * @return {@code double}
     */
    public double getDenominator() {
        return this.denominator.doubleValue();
    }

    /**
     * sets the denominator
     * @param denominator {@code java.lang.Number}
     */
    public void setDenominator(Number denominator) {
        this.denominator = denominator;
    }

    /**
     * toString method
     * @return {@code java.lang.String}
     */
    @Override
    public String toString(){
        return String.format("( %s / %s )", this.numerator.toString(), this.denominator.toString());
    }
}
