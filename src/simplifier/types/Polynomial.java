/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import java.util.ArrayList;

public class Polynomial {
    private Number[] list;

    public Polynomial(Number ... args) {
        this.list = args;
    }

    public String toString(){
        int a = 0;
        ArrayList<String> b = new ArrayList<>();
        for(int i = this.list.length+1; i > 0; i--){
            b.add(0, String.format("%fx^%d", this.list[i], a));
            a++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b.size()-1; i++){
            sb.append(b.get(i));
            sb.append(" + ");
        }
        sb.append(String.format("%fx^%d", this.list[this.list.length-1], this.list.length));

        return  sb.toString();
    }
}
