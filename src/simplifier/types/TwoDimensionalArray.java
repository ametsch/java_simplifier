/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import java.util.ArrayList;

public class TwoDimensionalArray<E>{

    private E[][] arr;
    private int rows, cols;

    public TwoDimensionalArray(E[][] arr){
        this.arr = arr;
    }

    public E get(int row, int col) {
        return arr[row][col];
    }

    public int size() {
        return rows*cols;
    }

    public void set(E e, int row, int col){
        arr[row][col] = e;
    }

    public E[][] toArray(){
        E[][] temp = arr;
        return temp;
    }

    public void setArr(E[][] arr){
        this.arr = arr;
    }

    public ArrayList<E> asArrayList(){
        ArrayList<E> temp = new ArrayList<>();
        for(int i = 0; i < this.rows; i++){
            for (int j = 0; j < this.cols; j++) {
                temp.add(arr[i][j]);
            }
        }
        return temp;
    }
}
