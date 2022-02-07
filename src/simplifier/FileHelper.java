/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * a class to help with the use of files
 */
public class FileHelper {
    private FileHelper(){}

    /**
     *
     * @param file java.io.File
     * @return java.util.ArrayList of String's for each line of the file
     * @throws FileNotFoundException
     */
    public static ArrayList<String> readFullFileArrayList(File file) throws FileNotFoundException {
        if(!file.canRead()) {
            ArrayList<String> out = new ArrayList<>();
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                out.add(scanner.nextLine());
            }
            scanner.close();
            return out;

        }else{
            throw new FileNotFoundException("Error: File not found");
        }
        
    }

    /**
     *
     * @param file java.io.File
     * @return java.lang.String with all the contents of the file
     * @throws FileNotFoundException
     */
    public static String readFullFileString(File file) throws FileNotFoundException {
        if(!file.canRead()) {
            StringBuilder out = new StringBuilder();
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                out.append(scanner.nextLine());
                out.append("\n");
            }
            scanner.close();
            return out.toString();

        }else{
            throw new FileNotFoundException("Error: File not found");
        }
    }

    /**
     *
     * @param fn java.lang.String -- filename
     * @return java.util.ArrayList of String's for each line of the file
     * @throws FileNotFoundException
     */
    public static ArrayList<String> readFullFileArrayList(String fn) throws FileNotFoundException {
        File file = new File(fn);
        if(!file.canRead()) {
            ArrayList<String> out = new ArrayList<>();
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                out.add(scanner.nextLine());
            }
            scanner.close();
            return out;

        }else{
            throw new FileNotFoundException("Error: File not found");
        }
    }

    /**
     *
     * @param fn java.lang.String -- filename
     * @return java.lang.String with all the contents of the file
     * @throws FileNotFoundException
     */
    public static String readFullFileString(String fn) throws FileNotFoundException {
        File file = new File(fn);
        if(!file.canRead()) {
            StringBuilder out = new StringBuilder();
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                out.append(scanner.nextLine());
                out.append("\n");
            }
            scanner.close();
            return out.toString();

        }else{
            throw new FileNotFoundException("Error: File not found");
        }
    }
}
