/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */

/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiByte extends MultiNum{
    private ArrayList<Byte> arr;

    public MultiByte(ArrayList<Byte> arr){
        super();
        this.arr = arr;
    }
    public MultiByte(Byte[] arr){
        super();
        this.arr = new ArrayList<Byte>(Arrays.asList(arr));
    }
    public MultiByte(){
        super();
        this.arr = new ArrayList<>();
    }
    public void add(byte b){
        this.arr.add(b);
    }
    public void add(byte[] b){
        for(byte i : b){
            this.arr.add(i);
        }
    }
    public void add(ArrayList<Byte> b){
        for(byte i : b){
            this.arr.add(i);
        }
    }

    public String asString(){
        StringBuilder sb = new StringBuilder();
        for(byte i : arr){
            sb.append((char) (i & 0xFF));
        }
        return sb.toString();
    }

}
