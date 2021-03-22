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
     * @param a java.lang.String
     */
    public HexInt(String a){
        super();
        this.val = Long.valueOf(a);
    }

    /**
     * constructor from a Number
     * @param a java.lang.Number
     */
    public HexInt(Number a){
        super();
        this.val = a.longValue();
    }

    /**
     * toString method
     * @return java.lang.String
     */
    @Override
    public String toString(){
        return Long.toHexString(this.val);
    }

    /**
     * returns int value
     * @return int
     */
    @Override
    public int intValue() {
        return (int) this.val;
    }

    /**
     * returns long value
     * @return long
     */
    @Override
    public long longValue() {
        return this.val;
    }

    /**
     * returns float value
     * @return float
     */
    @Override
    public float floatValue() {
        return this.val;
    }

    /**
     * returns double value
     * @return double
     */
    @Override
    public double doubleValue() {
        return this.val;
    }
}
