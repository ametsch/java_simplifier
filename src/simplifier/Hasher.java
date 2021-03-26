/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier;


import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Java program to calculate SHA hash value

/**
 * a class to make hashing using the SHA algorithms much easier
 */
class Hasher {
    private Hasher(){}
    /**
     * the hash algorithm you want the class to use
     */
    private static final String hashAlgo = "SHA3-256";

    /**
     * a function to convert the given String into a hash digest as an array of bytes
     * @param input
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance(hashAlgo);

        // digest() method called
        // to calculate message digest of an input
        // and return array of bytes
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * a function to convert the given array of bytes into a hexadecimal String
     * @param hash
     * @return
     */
    public static String toHexString(byte[] hash) {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);

        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));

        // Pad with leading zeros
        while (hexString.length() < 32)
        {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }

    /**
     * a function to combine the getSHA() and toHexString() and includes the try and catch statements
     * @param input
     * @return
     */
    public static String stringHash(Object input){
        String newHash = "";
        try {
            newHash = Hasher.toHexString(Hasher.getSHA(input.toString()));
        }catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
        return newHash;
    }
}
