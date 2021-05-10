/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiInt extends MultiNum{
    private ArrayList<Integer> arr;

    public MultiInt(ArrayList<Integer> arr){
        super();
        this.arr = arr;
    }
    public MultiInt(Integer[] arr){
        super();
        this.arr = new ArrayList<Integer>(Arrays.asList(arr));
    }
    public MultiInt(){
        super();
        this.arr = new ArrayList<>();
    }

    public void add(int b){
        this.arr.add(b);
    }
    public void add(Integer[] b){
        for(Integer i : b){
            this.arr.add(i);
        }
    }
    public void add(ArrayList<Integer> b){
        for(Integer i : b){
            this.arr.add(i);
        }
    }
}
