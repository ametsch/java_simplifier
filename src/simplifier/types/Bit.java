/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import javax.management.InvalidAttributeValueException;

public class Bit extends Number{
    private byte value;

    public Bit(byte value) throws InvalidAttributeValueException {
        super();
        if(value == 0 || value == 1){
            this.value = value;
        }else{
            throw new InvalidAttributeValueException("Error: Value must be 1 or 0");
        }
    }
    public Bit(){
        super();
    }

    public void setValue(byte value) throws InvalidAttributeValueException {
        if(value == 0 || value == 1){
            this.value = value;
        }else{
            throw new InvalidAttributeValueException("Error: Value must be 1 or 0");
        }
    }

    @Override
    public int intValue() {
        return this.value;
    }

    @Override
    public long longValue() {
        return this.value;
    }

    @Override
    public float floatValue() {
        return this.value;
    }

    @Override
    public double doubleValue() {
        return this.value;
    }

    public String toString(){
        return String.format("%d", this.value);
    }
}
