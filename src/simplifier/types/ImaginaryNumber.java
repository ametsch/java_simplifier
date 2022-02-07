/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

/**
 * a class for an imaginary number in the form a+bi
 */
public class ImaginaryNumber {
    private double a, b;

    /**
     * basic constructor
     */
    public ImaginaryNumber(){
        this.a = 0d;
        this.b = 0d;
    }

    /**
     * constructor using 2 Number values
     * @param a {@code java.lang.Number}
     * @param b {@code java.lang.Number} -- the coefficient of i
     */
    public ImaginaryNumber(Number a, Number b){
        this.a = a.doubleValue();
        this.b = b.doubleValue();
    }

    /**
     * toString method
     * @return {@code java.lang.String}
     */
    @Override
    public String toString(){
        if(this.b > 0d){
            return String.format("%f+%fi", this.a, this.b);
        }
        return String.format("%f-%fi", this.a, (this.b * (-1d)));
    }

    /**
     * returns the value of a
     * @return {@code double}
     */
    public double getA() {
        return this.a;
    }

    /**
     * sets the value of a
     * @param a {@code java.lang.Number}
     */
    public void setA(Number a) {
        this.a = a.doubleValue();
    }

    /**
     * returns the value of b
     * @return {@code double}
     */
    public double getB() {
        return this.b;
    }

    /**
     * sets the value of b
     * @param b {@code java.lang.Number}
     */
    public void setB(Number b) {
        this.b = b.doubleValue();
    }

    /**
     *
     * @param val {@code ImaginaryNumber}
     * @return {@code ImaginaryNumber} -- the sum of the current imaginary number and val
     */
    public ImaginaryNumber add(ImaginaryNumber val){
        return new ImaginaryNumber(val.getA()+this.getA(), val.getB()+this.getB());
    }
    // public static void sqrt(Number num){
    //     boolean i = false;
    //     if(num.doubleValue() < 0){
    //         num = num.doubleValue() * -1;
    //         i = true;
    //     }
    // }
}

