/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types.polynomial;

public class Monomial {
    private Number coeff, exp;

    public Monomial(Number coeff, Number exp) {
        this.coeff = coeff;
        this.exp = exp;
    }
    public Monomial() {
        this.coeff = 0;
        this.exp = 0;
    }
    public Number getcoeff() {
        return coeff;
    }
    public void setcoeff(Number coeff) {
        this.coeff = coeff;
    }
    public Number getExponent() {
        return exp;
    }
    public void setExponent(Number exp) {
        this.exp = exp;
    }

    public double evaluate(Number val){
        return this.coeff.doubleValue() * (Math.pow(val.doubleValue(), this.exp.doubleValue()));
    }

    public String toString(){
        return this.coeff.toString()+"X^"+this.exp;
    }

    public Monomial dy_dx(){
        return new Monomial((this.coeff.doubleValue()*this.exp.doubleValue()), this.exp.doubleValue()-1);
    }
}
