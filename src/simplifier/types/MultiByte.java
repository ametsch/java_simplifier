/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */

/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiByte {
    private ArrayList<Byte> arr;

    public MultiByte(ArrayList<Byte> arr){
        this.arr = arr;
    }
    public MultiByte(Byte[] arr){
        this.arr = new ArrayList<Byte>(Arrays.asList(arr));
    }
    public MultiByte(){
        this.arr = new ArrayList<>();
    }
    public void add(byte b){
        this.arr.add(b);
    }
    public void add(Byte[] b){
        for(Byte i : b){
            this.arr.add(i);
        }
    }
    public void add(ArrayList<Byte> b){
        for(Byte i : b){
            this.arr.add(i);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(byte i : this.arr){
            sb.append(i);
            sb.append("  ");
        }
        return sb.toString();
    }

    public String getHex(){
        StringBuilder sb = new StringBuilder();

        for(Byte i : this.arr){
            sb.append(hexByte(i));
            sb.append("  ");
        }

        return sb.toString();
    }

    public static String hexByte(Byte a){
        String temp = Integer.toHexString(a);
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
        for(Byte i : this.arr){
            sb.append(i);
            sb.append("\t\t");
            sb.append(hexByte(i));
            sb.append("\n");
        }

        return sb.toString().toUpperCase();
    }


}
