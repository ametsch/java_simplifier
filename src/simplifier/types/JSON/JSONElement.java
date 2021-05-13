/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types.JSON;

public class JSONElement<E> {
    private String key;
    private E value;

    public JSONElement(String key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        return String.format("\"%s\" : \"%s\"", key, value.toString());
    }
}
