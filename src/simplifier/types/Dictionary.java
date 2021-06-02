/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import java.util.ArrayList;

/**
 * a class that attempts to mimic a python dictionary
 */
public class Dictionary {
    private ArrayList<String> keys;
    private ArrayList<Object> values;
    private int length;

    public Dictionary() {
        keys = new ArrayList<String>();
        values = new ArrayList<>();
        length = 0;
    }

    public void add(String key, Object value) throws IndexOutOfBoundsException{
        if(!keys.contains(key)){
            keys.add(key);
            values.add(value);
            length++;
        }else{
            throw new IndexOutOfBoundsException("You may not have repeat keys.");
        }
    }

    public Object get(String key){
        if(keys.contains(key)){
            return values.get(keys.indexOf(key));
        }else{
            return null;
        }
    }

    public void remove(String key){
        if(keys.contains(key)){
            keys.remove(key);
            values.remove(keys.indexOf(key));
            length--;
        }
    }

    public int size(){
        return length;
    }
}
