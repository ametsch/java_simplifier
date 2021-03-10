package Simplifier;

import java.util.regex.*;

/**
 * A class to assist with the use of Regular Expressions
 */
public class RegExHelper {

    private RegExHelper(){}
    /**
     * a regular expression to check if a String is alpha numeric
     */
    public static final Pattern isAlphaNumeric = Pattern.compile("^[a-zA-Z0-9]+$");
    /**
     * a regular expression to check if a String is alphabetical
     */
    public static final Pattern isAlpha = Pattern.compile("^[a-zA-Z]+$");
    /**
     * a regular expression to check if a String is numeric
     */
    public static final Pattern isNumeric = Pattern.compile("^[0-9]+$");
    /**
     * a regular expression to check if a String is hexadecimal
     */
    public static final Pattern isHex = Pattern.compile("^[0-9a-fA-F]+$");
    /**
     * a regular expression to check if a String is a floating point number
     */
    public static final Pattern isFloat = Pattern.compile("^[0-9]+\\.[0-9]*?$");

    /**
     * a regular expression to check if a String is alpha numeric with spaces
     */
    public static final Pattern isAlphaNumericSpace = Pattern.compile("^[ a-zA-Z0-9]+$");
    /**
     * a regular expression to check if a String is alphabetical with spaces
     */
    public static final Pattern isAlphaSpace = Pattern.compile("^[ a-zA-Z]+$");
    /**
     * a regular expression to check if a String is numeric with spaces
     */
    public static final Pattern isNumericSpace = Pattern.compile("^[ 0-9]+$");
    /**
     * a regular expression to check if a String is hexadecimal with spaces
     */
    public static final Pattern isHexSpace = Pattern.compile("^[ 0-9a-fA-F]+$");
    /**
     * a regular expression to check if a String is made up of ASCII characters
     */
    public static final Pattern isASCII = Pattern.compile("^[\\x00-\\x7F]+$");
    /**
     * a regular expression to check if a String is a valid email address
     */
    public static final Pattern isEmail = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    /**
     * a regular expression to check if a String is a valid URL
     */
    public static final Pattern isURL = Pattern.compile("^(https?|ftps?|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]$");
    /**
     * a regular expression to check if a String is a valid unix timestamp
     */
    public static final Pattern isUnixTimestamp = Pattern.compile("^[0-9]+$");
    /**
     * a regular expression to check if a String is a binary number
     */
    public static final Pattern isBinary = Pattern.compile("^[0-1]+$");
    /**
     * a regular expression to check if a String is an octal number
     */
    public static final Pattern isOctal = Pattern.compile("^[0-7]+$");
    /**
     * a regular expression to check if a String is a number written in roman numerals
     */
    public static final Pattern isRomanNumeral = Pattern.compile("^[IiVvXxLlCcDdMm]+$");
    /**
     * a regular expression to check if a String is a number written in Youtube's base 64 number system
     */
    public static final Pattern isYTBase64 = Pattern.compile("^[0-9a-zA-Z-_]+$");
    /**
     * a regular expression to check if a String is one byte in binary
     */
    public static final Pattern isByteBinary = Pattern.compile("^[0-1]{8}$");
    /**
     * a regular expression to check if a String is one byte in hexadecimal
     */
    public static final Pattern isByteHex = Pattern.compile("^[0-9a-fA-F]{2}$");

    //name formats
    /**
     * a regular expression to check if a String is a name in the form "First, Last"
     */
    public static final Pattern isFirstCommaLast = Pattern.compile("^[A-Za-z-]+, ?[A-Za-z-]+$");
    /**
     * a regular expression to check if a String is a name in the form "Last, First"
     */
    public static final Pattern isLastCommaFirst = Pattern.compile("^[A-Za-z-]+, ?[A-Za-z-]+$");
    /**
     * a regular expression to check if a String is a name in the form "First Last"
     */
    public static final Pattern isFirstSpaceLast = Pattern.compile("^[A-Za-z-]+ [A-Za-z-]+$");
    /**
     * a regular expression to check if a String is a name in the form "Last First"
     */
    public static final Pattern isLastSpaceFirst = Pattern.compile("^[A-Za-z-]+ [A-Za-z-]+$");



    // Date formats based on this list: https://docs.oracle.com/cd/E41183_01/DR/Date_Format_Types.html
    /**
     * a regular expression to check if a String is a date in the format "MM/DD/YY"
     */
    public static final Pattern isDate1 = Pattern.compile("^[0-1][0-9]/[0-3][0-9]/[0-9]{4}$");
    /**
     * a regular expression to check if a String is a date in the format "DD/MM/YY"
     */
    public static final Pattern isDate2 = Pattern.compile("^[0-3][0-9]/[0-1][0-9]/[0-9]{4}$");
    /**
     * a regular expression to check if a String is a date in the format "YY/MM/DD"
     */
    public static final Pattern isDate3 = Pattern.compile("^[0-9]{4}/[0-1][0-9]/[0-3][0-9]$");
    /**
     * a regular expression to check if a String is a date in the format "MMDDYY"
     */
    public static final Pattern isDateB = Pattern.compile("^[0-1][0-9][0-3][0-9][0-9]{4}$");
    /**
     * a regular expression to check if a String is a date in the format "DDMMYY"
     */
    public static final Pattern isDateC = Pattern.compile("^[0-3][0-9][0-1][0-9][0-9]{4}$");
    /**
     * a regular expression to check if a String is a date in the format "YYMMDD"
     */
    public static final Pattern isDateD = Pattern.compile("^[0-9]{4}[0-1][0-9][0-3][0-9]$");

    /**
     *
     * @param pat java.util.regex.Pattern -- the regular expression you want to use
     * @param str java.lang.String -- the String you want to search
     * @return boolean -- if "str" matches the regular expression "pat"
     */
    public static boolean match(Pattern pat, String str){
        Matcher m = pat.matcher(str);
        return m.matches();
    }

    /**
     * 
     * @param pat java.lang.String -- the String of the regular expression you want to create
     * @return java.util.regex.Pattern -- the regular expression
     */
    public static Pattern mkPat(String pat){
        return Pattern.compile(pat);
    }

}
