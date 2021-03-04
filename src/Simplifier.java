
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
//----------------------------------------------------------------------------------------------------------------------
    public static void p(String a){
        System.out.print(a);
    }
    public static void p(int a){
        System.out.print(a);
    }
    public static void p(short a){
        System.out.print(a);
    }
    public static void p(long a){
        System.out.print(a);
    }
    public static void p(double a){
        System.out.print(a);
    }
    public static void p(float a){
        System.out.print(a);
    }
    public static void p(char a){
        System.out.print(a);
    }
    public static void p(byte a){
        System.out.print(a);
    }
    public static void p(boolean a){
        System.out.print(a);
    }
//------------------------------------------------------------------------------------------------------------------
    public static void pln(String a){
        System.out.println(a);
    }
    public static void pln(int a){
        System.out.println(a);
    }
    public static void pln(short a){
        System.out.println(a);
    }
    public static void pln(long a){
        System.out.println(a);
    }
    public static void pln(double a){
        System.out.println(a);
    }
    public static void pln(float a){
        System.out.println(a);
    }
    public static void pln(char a){
        System.out.println(a);
    }
    public static void pln(byte a){
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
    public static boolean isEqual(Integer a, Integer b){
        if(a != null && b != null){
            return a.equals(b);
        }else{
            return false;
        }
    }
    public static boolean isEqual(Short a, Short b){
        if(a != null && b != null){
            return a.equals(b);
        }else{
            return false;
        }
    }
    public static boolean isEqual(Long a, Long b){
        if(a != null && b != null){
            return a.equals(b);
        }else{
            return false;
        }
    }
    public static boolean isEqual(Double a, Double b){
        if(a != null && b != null){
            return a.equals(b);
        }else{
            return false;
        }
    }
    public static boolean isEqual(Float a, Float b){
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
    public static boolean isEqual(Byte a, Byte b){
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

}
