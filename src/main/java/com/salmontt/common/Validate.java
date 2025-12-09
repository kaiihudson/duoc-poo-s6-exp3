package com.salmontt.common;

public class Validate {
    /**
     * Validation to assure a number is a number and acts like a number
     * @param rawNumber the string containing a suspected number
     * @return the number in int format
     * @throws NumberFormatException if the number does not parse
     */
    public static int validateInteger(String rawNumber) throws NumberFormatException {
        return Integer.parseInt(rawNumber);
    }
}
