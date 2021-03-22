/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * a class for a single variable polynomial
 */
public class SingleVarPolynomial {
    private ArrayList<Number> list;

    /**
     * constructor from array
     * @param args
     */
    public SingleVarPolynomial(Number ... args) {
        this.list = new ArrayList<Number>(Arrays.asList(args));
    }

    /**
     * constructor from ArrayList
     * @param args
     */
    public SingleVarPolynomial(ArrayList<Number> args){
        this.list = args;
    }

    /**
     * toString method
     * @return java.lang.String
     */
    @Override
    public String toString(){
        int a = 0;
        ArrayList<String> b = new ArrayList<>();
        for(int i = this.list.size(); i > 0; i--){
            b.add(0, String.format("%fx^%d", this.list.get(i), a));
            a++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b.size()-1; i++){
            sb.append(b.get(i));
            sb.append(" + ");
        }
        sb.append(String.format("%fx^%d", this.list.get(this.list.size()-1), this.list.size()));

        return  sb.toString();
    }

    /**
     * evaluates the polynomial with value of x
     * @param x java.lang.Number
     * @return double
     */
    public Number eval(Number x){
        double out = 0d;
        for(int i = 0; i < this.list.size(); i++){
            out += this.list.get(i).doubleValue()*(Math.pow(x.doubleValue(), i));
        }
        return out;
    }
}
