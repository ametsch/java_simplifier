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
     * @param a java.lang.Number
     * @param b java.lang.Number -- the coefficient of i
     */
    public ImaginaryNumber(Number a, Number b){
        this.a = a.doubleValue();
        this.b = b.doubleValue();
    }

    /**
     * toString method
     * @return java.lang.String
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
     * @return double
     */
    public double getA() {
        return this.a;
    }

    /**
     * sets the value of a
     * @param a java.lang.Number
     */
    public void setA(Number a) {
        this.a = a.doubleValue();
    }

    /**
     * returns the value of b
     * @return double
     */
    public double getB() {
        return this.b;
    }

    /**
     * sets the value of b
     * @param b java.lang.Number
     */
    public void setB(Number b) {
        this.b = b.doubleValue();
    }


}
