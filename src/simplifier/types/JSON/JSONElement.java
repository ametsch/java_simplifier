/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types.JSON;

import java.util.IllegalFormatConversionException;

public class JSONElement<E> {
    private String key;
    private E value;

    public JSONElement(String key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        try{
            return String.format("\"%s\" : %d", key, value);
        }catch (IllegalFormatConversionException e){
            try {
                return String.format("\"%s\" : %f", key, value);
            }catch (IllegalFormatConversionException f){
                return String.format("\"%s\" : \"%s\"", key, value.toString());
            }
        }
    }
}
