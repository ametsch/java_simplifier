/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types.polynomial;

import java.util.ArrayList;

public class Polynomial {
    ArrayList<Monomial> list;

    public Polynomial(ArrayList<Monomial> list) {
        this.list = list;
    }
    public Polynomial() {
        this.list = new ArrayList<>();
    }
    public void add(Monomial val){
        this.list.add(val);
    }
    public void remove(Monomial val){
        this.list.remove(val);
    }
    public double evaluate(Number val){
        double x = val.doubleValue();
        double result = 0;
        for(Monomial temp : this.list){
            result += temp.evaluate(x);
        }
        return result;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Monomial temp : this.list){
            sb.append("+"+temp.toString());
        }
        return sb.toString();
    }
}
