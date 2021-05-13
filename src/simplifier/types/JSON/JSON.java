/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types.JSON;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class JSON {
    private ArrayList<JSONElement> arr;

    public JSON(ArrayList<JSONElement> arr) {
        this.arr = arr;
    }

    public JSON(JSONElement ... args) {
        this.arr = new ArrayList<>(Arrays.asList(args));
    }

    public JSON(){
        arr = new ArrayList<>();
    }

    public void add(JSONElement arg){
        arr.add(arg);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("{\n");
        for(JSONElement element : arr){
            sb.append(element.toString());
            sb.append(",\n");
        }
        sb.deleteCharAt(sb.length()-2);
        sb.append("}");
        return sb.toString();
    }

    public void toFile(String filePath){
        PrintStream out = null;
        try {
            out = new PrintStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assert out != null;
        out.print(this.toString());
        out.close();
    }
}
