/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

public class ImaginaryNumber {
    private double a, b;

    public ImaginaryNumber(){
        this.a = 0d;
        this.b = 0d;
    }

    public ImaginaryNumber(Number a, Number b){
        this.a = a.doubleValue();
        this.b = b.doubleValue();
    }

    public String toString(){
        if(this.b > 0d){
            return String.format("%f+%fi", this.a, this.b);
        }
        return String.format("%f-%fi", this.a, (this.b * (-1d)));
    }

    public double getA() {
        return this.a;
    }

    public void setA(Number a) {
        this.a = a.doubleValue();
    }

    public double getB() {
        return this.b;
    }

    public void setB(Number b) {
        this.b = b.doubleValue();
    }


}
