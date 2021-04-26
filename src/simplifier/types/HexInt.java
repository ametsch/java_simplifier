/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

/**
 * a class to store a hexadecimal integer
 */
public class HexInt extends Number{

    private long val;

    /**
     * constructor from a String
     * @param a {@code java.lang.String}
     */
    public HexInt(String a){
        super();
        this.val = Long.valueOf(a);
    }

    /**
     * constructor from a Number
     * @param a {@code java.lang.Number}
     */
    public HexInt(Number a){
        super();
        this.val = a.longValue();
    }

    /**
     * toString method
     * @return {@code java.lang.String}
     */
    @Override
    public String toString(){
        return Long.toHexString(this.val);
    }

    /**
     * returns {@code int} value
     * @return {@code int}
     */
    @Override
    public int intValue() {
        return (int) this.val;
    }

    /**
     * returns {@code long} value
     * @return {@code long}
     */
    @Override
    public long longValue() {
        return this.val;
    }

    /**
     * returns {@code float} value
     * @return {@code float}
     */
    @Override
    public float floatValue() {
        return this.val;
    }

    /**
     * returns {@code double} value
     * @return {@code double}
     */
    @Override
    public double doubleValue() {
        return this.val;
    }
}
