/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types.polynomial;

public class Monomial {
    private Number coefficient, exponent;

    public Monomial(Number coefficient, Number exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }
    public Monomial() {
        this.coefficient = 0;
        this.exponent = 0;
    }
    public Number getCoefficient() {
        return coefficient;
    }
    public void setCoefficient(Number coefficient) {
        this.coefficient = coefficient;
    }
    public Number getExponent() {
        return exponent;
    }
    public void setExponent(Number exponent) {
        this.exponent = exponent;
    }

    public double evaluate(Number val){
        return this.coefficient.doubleValue() * (Math.pow(val.doubleValue(), this.exponent.doubleValue()));
    }

    public String toString(){
        return this.coefficient.toString()+"X^"+this.exponent;
    }
}
