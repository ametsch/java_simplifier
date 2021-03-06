/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */

/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import java.util.ArrayList;

public abstract class MultiNum {

    private ArrayList<Number> arr;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Number i : this.arr){
            sb.append(i);
            sb.append("  ");
        }
        return sb.toString();
    }

    public String getHex(){
        StringBuilder sb = new StringBuilder();

        for(Number i : this.arr){
            sb.append(hexNum(i));
            sb.append("  ");
        }

        return sb.toString();
    }

    public static String hexNum(Number a){
        String temp = Integer.toHexString(a.intValue());
        if(temp.length() == 1){
            return "0"+temp;
        }else if(temp.length() == 2){
            return temp;
        }else{
            return "GG";
        }
    }

    public String getValues(){
        StringBuilder sb = new StringBuilder();
        for(Number i : this.arr){
            sb.append(i);
            sb.append("\t\t");
            sb.append(hexNum(i));
            sb.append("\n");
        }
        return sb.toString().toUpperCase();
    }

}
