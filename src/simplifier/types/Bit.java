/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import javax.management.InvalidAttributeValueException;

/**
 * a class to store a single bit
 */
public class Bit extends Number{
    private byte value;

    /**
     * constructor
     * @param value byte
     * @throws InvalidAttributeValueException if value is not 1 or 0
     */
    public Bit(byte value) throws InvalidAttributeValueException {
        super();
        if(value == 0 || value == 1){
            this.value = value;
        }else{
            throw new InvalidAttributeValueException("Error: Value must be 1 or 0");
        }
    }

    /**
     * basic constructor
     */
    public Bit(){
        super();
    }

    /**
     * a method to set the value
     * @param value byte
     * @throws InvalidAttributeValueException if value is not 1 or 0
     */
    public void setValue(byte value) throws InvalidAttributeValueException {
        if(value == 0 || value == 1){
            this.value = value;
        }else{
            throw new InvalidAttributeValueException("Error: Value must be 1 or 0");
        }
    }

    /**
     * returns int value
     * @return int
     */
    @Override
    public int intValue() {
        return this.value;
    }

    /**
     * returns long value
     * @return long
     */
    @Override
    public long longValue() {
        return this.value;
    }

    /**
     * returns float value
     * @return float
     */
    @Override
    public float floatValue() {
        return this.value;
    }

    /**
     * returns double value
     * @return double
     */
    @Override
    public double doubleValue() {
        return this.value;
    }

    /**
     * a method to return the value as a boolean (1:True, 0:False)
     * @return boolean
     * @throws InvalidAttributeValueException if value is not 1 or 0
     */
    public boolean BooleanValue() throws InvalidAttributeValueException {
        if (this.value == 0){
            return false;
        }else if(this.value == 1){
            return true;
        }else{
            throw new InvalidAttributeValueException("Error: Value must be 1 or 0");
        }
    }

    /**
     * toString method
     * @return java.lang.String
     */
    @Override
    public String toString(){
        return String.format("%d", this.value);
    }
}
