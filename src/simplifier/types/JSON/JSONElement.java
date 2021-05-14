/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


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
                try {
                    if (((JSON)value).isJSON()){
                        return String.format("\"%s\" : %s", key, value.toString());
                    }
                }catch (ClassCastException g){
                    return String.format("\"%s\" : \"%s\"", key, value.toString());
                }
            }
        }
        return "";
    }
}
