import java.nio.charset.Charset;


public class Simplifier {
    private Simplifier(){}
//----------------------------------------------------------------------------------------------------------------------
    public static final short shortUpperLimit = 32767;
    public static final short shortLowerLimit = -32768;

    public static final int intUpperLimit = 2147483647;
    public static final int intLowerLimit = -2147483648;

    public static final long longUpperLimit = 9223372036854775807L;
    public static final long longLowerLimit = -9223372036854775808L;

    public static final byte byteUpperLimit = 127;
    public static final byte byteLowerLimit = -128;

    public static final float floatUpperLimit = 3.4e+038f;
    public static final float floatLowerLimit = 3.4e-038f;

    public static final double doubleUpperLimit = 1.7e+308d;
    public static final double doubleLowerLimit = 1.7e-308d;

    public static final double pi = 3.14159265358979d;
    public static final float piFloat = 3.14159265358979f;

    public static final double e = 2.71828182845904d;
    public static final float eFloat = 2.71828182845904f;
//----------------------------------------------------------------------------------------------------------------------
    public static void p(String a){
        System.out.print(a);
    }
    public static void p(char a){
        System.out.print(a);
    }
    public static void p(Number a){
        System.out.print(a);
    }
    public static void p(boolean a){
        System.out.print(a);
    }
//------------------------------------------------------------------------------------------------------------------
    public static void pln(String a){
        System.out.println(a);
    }
    public static void pln(char a){
        System.out.println(a);
    }
    public static void pln(Number a){
        System.out.println(a);
    }
    public static void pln(boolean a){
        System.out.println(a);
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void pf(String a, Object ... args){
        System.out.printf(a, args);
    }
//----------------------------------------------------------------------------------------------------------------------
    public static boolean isEqual(String a, String b){
        if(a != null && b != null){
            return a.equals(b);
        }else{
            return false;
        }
    }
    public static boolean isEqual(Number a, Number b){
        if(a != null && b != null){
            return a.equals(b);
        }else{
            return false;
        }
    }
    public static boolean isEqual(Character a, Character b){
        if(a != null && b != null){
            return a.equals(b);
        }else{
            return false;
        }
    }
    public static boolean isEqual(Boolean a, Boolean b){
        if(a != null && b != null){
            return a.equals(b);
        }else{
            return false;
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    public static double float2double(Float a){
        return Double.valueOf(a);
    }
    public static String charArray2string(char[] a){
        return new String(a);
    }
    public static String obj2strCombiner(Object ... args){
        StringBuilder temp = new StringBuilder();
        for(Object i : args){
            temp.append(i);
        }
        return temp.toString();
    }
    public static long str2long(String a){
        return Long.valueOf(a);
    }
    public static int str2int(String a){
        return Integer.valueOf(a);
    }
    public static double str2double(String a){
        return Double.valueOf(a);
    }
    public static short str2short(String a){
        return Short.valueOf(a);
    }
    public static byte str2byte(String a){
        return Byte.valueOf(a);
    }
    public static float str2float(String a){
        return Float.valueOf(a);
    }
    public static byte[] str2byteArray(String a){
        return a.getBytes(Charset.forName("UTF-8"));
    }
    public static String byteArray2string(byte[] a){
        return new String(a, Charset.forName("UTF-8"));
    }
    public static byte[] str2byteArray(String a, Charset charset){
        return a.getBytes(charset);
    }
    public static String byteArray2string(byte[] a, Charset charset){
        return new String(a, charset);
    }
    public static String byteArray2hexString(byte[] a){
        StringBuilder sb = new StringBuilder();
        for(Byte i : a){
            int temp = (int) i;
            sb.append(Integer.toHexString(temp));
            sb.append(" ");
        }
        return sb.toString();
    }
    public static long int2long(int a){
        return (long) a;
    }
    public static int short2int(short a){
        return (int) a;
    }
    public static long short2long(short a){
        return (long) a;
    }
//----------------------------------------------------------------------------------------------------------------------
    public static boolean isNegative(Number i){
        if(i.doubleValue() < 0){
            return true;
        }
        return false;
    }
    public static boolean isPositive(Number i){
        if(i.doubleValue() < 0){
            return false;
        }
        return true;
    }
//----------------------------------------------------------------------------------------------------------------------

}
