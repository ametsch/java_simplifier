/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

public class HexInt extends Number{

    private long val;

    public HexInt(String a){
        super();
        this.val = Long.valueOf(a);
    }
    public HexInt(Number a){
        super();
        this.val = a.longValue();
    }

    @Override
    public String toString(){
        return Long.toHexString(this.val);
    }

    @Override
    public int intValue() {
        return (int) this.val;
    }

    @Override
    public long longValue() {
        return this.val;
    }

    @Override
    public float floatValue() {
        return this.val;
    }

    @Override
    public double doubleValue() {
        return this.val;
    }
}
