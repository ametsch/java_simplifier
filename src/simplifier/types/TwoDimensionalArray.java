/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;

/**
 * a class to assist with the use of 2D arrays
 * @param <E> -- the data type of  the 2D array ({@code E} must extend {@code Object})
 */
public class TwoDimensionalArray<E>{

    private E[][] arr;
    private int rows, cols;

    /**
     * constructor from a 2D Array
     * @param arr -- {@code E[][]}
     */
    public TwoDimensionalArray(E[][] arr){
        this.arr = arr;
        this.rows = arr.length;
        this.cols = arr[0].length;
    }

    /**
     * get method
     * @param row -- {@code int}
     * @param col -- {@code int}
     * @return the value at the given location
     */
    public E get(int row, int col) {
        return arr[row][col];
    }

    /**
     * size method
     * @return the number of cells in the 2D array
     */
    public int size() {
        return rows*cols;
    }

    /**
     * set method
     * @param e -- {@code E} -- the value to set to the specified position
     * @param row -- {@code int}
     * @param col -- {@code int}
     */
    public void set(E e, int row, int col){
        arr[row][col] = e;
    }

    /**
     * returns 2D array of the TwoDimensionalArray object
     * @return {@code E[][]}
     */
    public E[][] toArray(){
        E[][] temp = arr;
        return temp;
    }

    /**
     * a method to overwrite the array
     * @param arr -- {@code E[][]}
     */
    public void setArr(E[][] arr){
        this.arr = arr;
    }

    /**
     * a method to return all data as a 1D ArrayList
     * @return {@code ArrayList<E>}
     */
    public ArrayList<E> asArrayList(){
        ArrayList<E> temp = new ArrayList<>();
        for(int i = 0; i < this.rows; i++){
            for (int j = 0; j < this.cols; j++) {
                temp.add(arr[i][j]);
            }
        }
        return temp;
    }

    /**
     * a method to set an entire row at once
     * @param e -- {@code E[]} -- an array of E that is the same length as the number of columns
     * @param row -- {@code int} -- the row to replace;
     * @throws InvalidAttributeValueException when e is not the same length as the number of columns
     */
    public void setRow(E[] e, int row) throws InvalidAttributeValueException {
        if(e.length == cols){
            arr[row] = e;
        }else{
            throw new InvalidAttributeValueException("e must be the same length as the number of columns.");
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public boolean isSquare(){
        return rows == cols;
    }
}
