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

    public ImaginaryNumber(double a, double b){
        this.a = a;
        this.b = b;
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

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }


}
