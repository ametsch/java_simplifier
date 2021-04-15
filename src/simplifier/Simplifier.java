/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.Arrays;

/**
 * A class that assists in simplifying your java experience
 */
public class Simplifier {
    private Simplifier(){}
//----------------------------------------------------------------------------------------------------------------------
    /**
     * The Maximum value of datatypes "short" and "java.lang.Short"
     */
    public static final short shortUpperLimit = 32_767;
    /**
     * The Minimum value of datatypes "short" and "java.lang.Short"
     */
    public static final short shortLowerLimit = -32_768;

    /**
     * The Maximum value of datatypes "int" and "java.lang.Integer"
     */
    public static final int intUpperLimit = 2_147_483_647;
    /**
     * The Minimum value of datatypes "int" and "java.lang.Integer"
     */
    public static final int intLowerLimit = -2_147_483_648;

    /**
     * The Maximum value of datatypes "long" and "java.lang.Long"
     */
    public static final long longUpperLimit = 9_223_372_036_854_775_807L;
    /**
     * The Minimum value of datatypes "long" and "java.lang.Long"
     */
    public static final long longLowerLimit = -9_223_372_036_854_775_808L;

    /**
     * The Maximum value of datatypes "byte" and "java.lang.Byte"
     */
    public static final byte byteUpperLimit = 127;
    /**
     * The Minimum value of datatypes "byte" and "java.lang.Byte"
     */
    public static final byte byteLowerLimit = -128;

    /**
     * The Maximum value of datatypes "float" and "java.lang.Float"
     */
    public static final float floatUpperLimit = 3.4e+038f;
    /**
     * The Minimum value of datatypes "float" and "java.lang.Float"
     */
    public static final float floatLowerLimit = 3.4e-038f;

    /**
     * The Maximum value of datatypes "double" and "java.lang.Double"
     */
    public static final double doubleUpperLimit = 1.7e+308d;
    /**
     * The Minimum value of datatypes "double" and "java.lang.Double"
     */
    public static final double doubleLowerLimit = 1.7e-308d;

    /**
     * The value of pi in datatype "double"
     */
    public static final double pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989d;
    /**
     * The value of pi in datatype "float"
     */
    public static final float piFloat = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989f;

    /**
     * The value of e in datatype "double"
     */
    public static final double e = 2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435729003342952605956307381323286279434907632338298807531952510190115738341879307021540891499348841675092447614606680822648001684774118537423454424371075390777449920695517027618386062613313845830007520449338265602976067371132007093287091274437470472306969772093101416928368190255151086574637721112523897844250569536967707854499699679468644549059879316368892300987931277361782154249992295763514822082698951936680331825288693984964651058209392398294887933203625094431173012381970684161403970198376793206832823764648042953118023287825098194558153017567173613320698112509961818815930416903515988885193458072738667385894228792284998920868058257492796104841984443634632449684875602336248270419786232090021609902353043699418491463140934317381436405462531520961836908887070167683964243781405927145635490613031072085103837505101157477041718986106873969655212671546889570350354d;
    /**
     * The value of e in datatype "float"
     */
    public static final float eFloat = 2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435729003342952605956307381323286279434907632338298807531952510190115738341879307021540891499348841675092447614606680822648001684774118537423454424371075390777449920695517027618386062613313845830007520449338265602976067371132007093287091274437470472306969772093101416928368190255151086574637721112523897844250569536967707854499699679468644549059879316368892300987931277361782154249992295763514822082698951936680331825288693984964651058209392398294887933203625094431173012381970684161403970198376793206832823764648042953118023287825098194558153017567173613320698112509961818815930416903515988885193458072738667385894228792284998920868058257492796104841984443634632449684875602336248270419786232090021609902353043699418491463140934317381436405462531520961836908887070167683964243781405927145635490613031072085103837505101157477041718986106873969655212671546889570350354f;

    /**
     * The value of phi in datatype "double"
     */
    public static final double phi = 1.61803398874989484820458683436563811772030917980576286213544862270526046281890244970720720418939113748475408807538689175212663386222353693179318006076672635443338908659593958290563832266131992829026788067520876689250171169620703222104321626954862629631361443814975870122034080588795445474924618569536486444924104432077134494704956584678850987433944221254487706647809158846074998871240076521705751797883416625624940758906970400028121042762177111777805315317141011704666599146697987317613560067087480710131795236894275219484353056783002287856997829778347845878228911097625003026961561700250464338243776486102838312683303724292675263116533924731671112115881863851331620384005222165791286675294654906811317159934323597349498509040947621322298101726107059611645629909816290555208524790352406020172799747175342777592778625619432082750513121815628551222480939471234145170223735805772786160086883829523045926478780178899219902707769038953219681986151437803149974110692608867429622675756052317277752035361393621076738d;
    /**
     * The value of phi in datatype "float"
     */
    public static final float phiFloat = 1.61803398874989484820458683436563811772030917980576286213544862270526046281890244970720720418939113748475408807538689175212663386222353693179318006076672635443338908659593958290563832266131992829026788067520876689250171169620703222104321626954862629631361443814975870122034080588795445474924618569536486444924104432077134494704956584678850987433944221254487706647809158846074998871240076521705751797883416625624940758906970400028121042762177111777805315317141011704666599146697987317613560067087480710131795236894275219484353056783002287856997829778347845878228911097625003026961561700250464338243776486102838312683303724292675263116533924731671112115881863851331620384005222165791286675294654906811317159934323597349498509040947621322298101726107059611645629909816290555208524790352406020172799747175342777592778625619432082750513121815628551222480939471234145170223735805772786160086883829523045926478780178899219902707769038953219681986151437803149974110692608867429622675756052317277752035361393621076738f;

    /**
     * The value of sqrt(2) in datatype "double"
     */
    public static final double sqrt2 = 1.4142135623730950488016887242096980785696718753769480731766797379907324784621070388503875343276415727350138462309122970249248360558507372126441214970999358314132226659275055927557999505011527820605714701095599716059702745345968620147285174186408891986095523292304843087143214508397626036279952514079896872533965463318088296406206152583523950547457502877599617298355752203375318570113543746034084988471603868999706990048150305440277903164542478230684929369186215805784631115966687130130156185689872372352885092648612494977154218334204285686060146824720771435854874155657069677653720226485447015858801620758474922657226002085584466521458398893944370926591800311388246468157082630100594858704003186480342194897278290641045072636881313739855256117322040245091227700226941127573627280495738108967504018369868368450725799364729060762996941380475654823728997180326802474420629269124859052181004459842150591120249441341728531478105803603371077309182869314710171111683916581726889419758716582152128229518488472089694633862891d;
    /**
     * The value of sqrt(2) in datatype "float"
     */
    public static final float sqrt2Float = 1.4142135623730950488016887242096980785696718753769480731766797379907324784621070388503875343276415727350138462309122970249248360558507372126441214970999358314132226659275055927557999505011527820605714701095599716059702745345968620147285174186408891986095523292304843087143214508397626036279952514079896872533965463318088296406206152583523950547457502877599617298355752203375318570113543746034084988471603868999706990048150305440277903164542478230684929369186215805784631115966687130130156185689872372352885092648612494977154218334204285686060146824720771435854874155657069677653720226485447015858801620758474922657226002085584466521458398893944370926591800311388246468157082630100594858704003186480342194897278290641045072636881313739855256117322040245091227700226941127573627280495738108967504018369868368450725799364729060762996941380475654823728997180326802474420629269124859052181004459842150591120249441341728531478105803603371077309182869314710171111683916581726889419758716582152128229518488472089694633862891f;

    /**
     * The value of null
     */
    public static final Object Null = null;
//----------------------------------------------------------------------------------------------------------------------

    /**
     * a simplified call of System.out.print(a)
     * @param a
     */
    public static void p(Object a){
        System.out.print(a);
    }
    /**
     * a simplified call of System.out.print(a)
     * @param a
     */
    public static void p(ArrayList<Object> a){
        System.out.print(a);
    }
    /**
     * a simplified call of System.out.print(a)
     * @param a
     */
    public static void p(List<Object> a){
        System.out.print(a);
    }
    /**
     * a simplified call of System.out.print(a)
     * @param a
     */
    public static void p(Set<Object> a){
        System.out.print(a);
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     * a simplified call of System.out.println(a)
     * @param a
     */
    public static void pln(Object a){
        System.out.println(a);
    }
    /**
     * a simplified call of System.out.println(a)
     * @param a
     */
    public static void pln(ArrayList<Object> a){
        System.out.println(a);
    }
    /**
     * a simplified call of System.out.println(a)
     * @param a
     */
    public static void pln(List<Object> a){
        System.out.print(a);
    }
    /**
     * a simplified call of System.out.println(a)
     * @param a
     */
    public static void pln(Set<Object> a){
        System.out.print(a);
    }
//----------------------------------------------------------------------------------------------------------------------

    /**
     * a method to create a newline in the System.out PrintStream
     */
    public static void newLine(){
        System.out.println();
    }
//----------------------------------------------------------------------------------------------------------------------

    /**
     * a simplified version of System.out.printf(a, args)
     * @param a
     * @param args
     */
    public static void pf(String a, Object ... args){
        System.out.printf(a, args);
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     * a function to tell if one Object is equal to another Object
     * @param a
     * @param b
     * @return
     */
    public static boolean isEqual(Object a, Object b){
        if(a != null && b != null){
            return a.equals(b);
        }else{
            return false;
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     * a method to convert a float to a double
     * @param a
     * @return
     */
    public static double float2double(Float a){
        return Double.valueOf(a);
    }
    /**
     *a method to convert a char[] to a String
     * @param a
     * @return
     */
    public static String charArray2string(char[] a){
        return new String(a);
    }

    /**
     * combines Objects into one String
     * @param args
     * @return java.lang.String
     */
    public static String obj2strCombiner(Object ... args){
        StringBuilder temp = new StringBuilder();
        for(Object i : args){
            temp.append(i);
        }
        return temp.toString();
    }
    /**
     * converts a java.lang.String to type long
     * @param a
     * @return
     */
    public static long str2long(String a){
        return Long.valueOf(a);
    }
    /**
     * converts a java.lang.String to type int
     * @param a
     * @return
     */
    public static int str2int(String a){
        return Integer.valueOf(a);
    }
    /**
     * converts a java.lang.String to type double
     * @param a
     * @return
     */
    public static double str2double(String a){
        return Double.valueOf(a);
    }
    /**
     * converts a java.lang.String to type short
     * @param a
     * @return
     */
    public static short str2short(String a){
        return Short.valueOf(a);
    }
    /**
     * converts a java.lang.String to type byte
     * @param a
     * @return
     */
    public static byte str2byte(String a){
        return Byte.valueOf(a);
    }
    /**
     * converts a java.lang.String to type float
     * @param a
     * @return
     */
    public static float str2float(String a){
        return Float.valueOf(a);
    }
    /**
     * converts a java.lang.String to type byte[]
     * @param a
     * @return
     */
    public static byte[] str2byteArray(String a){
        return a.getBytes(Charset.forName("UTF-8"));
    }
    /**
     * converts a byte[] to type String
     * @param a
     * @return
     */
    public static String byteArray2string(byte[] a){
        return new String(a, Charset.forName("UTF-8"));
    }
    /**
     * converts a byte[] to type String with specified Charset
     * @param a
     * @param charset
     * @return
     */
    public static byte[] str2byteArray(String a, Charset charset){
        return a.getBytes(charset);
    }
    /**
     * converts a byte[] to type String using the specified Charset
     * @param a
     * @param charset
     * @return
     */
    public static String byteArray2string(byte[] a, Charset charset){
        return new String(a, charset);
    }
    /**
     * converts a byte[] to a hexadecimal String
     * @param a
     * @return
     */
    public static String byteArray2hexString(byte[] a){
        StringBuilder sb = new StringBuilder();
        for(Byte i : a){
            int temp = (int) i;
            sb.append(Integer.toHexString(temp));
            sb.append(" ");
        }
        return sb.toString();
    }
    /**
     * converts an ArrayList of Byte's to a hexadecimal String
     * @param a
     * @return
     */
    public static String byteArrayList2hexString(ArrayList<Byte> a){
        StringBuilder sb = new StringBuilder();
        for(Byte i : a){
            int temp = (int) i;
            sb.append(Integer.toHexString(temp));
            sb.append(" ");
        }
        return sb.toString();
    }
    /**
     * converts an int to type long
     * @param a
     * @return
     */
    public static long int2long(int a){
        return a;
    }
    /**
     * converts a short to type int
     * @param a
     * @return
     */
    public static int short2int(short a){
        return a;
    }
    /**
     * converts a short to type long
     * @param a
     * @return
     */
    public static long short2long(short a){
        return a;
    }
//----------------------------------------------------------------------------------------------------------------------

    /**
     * a function to tell you if a Number is negative
     * @param i
     * @return
     */
    public static boolean isNegative(Number i){
        if(i.doubleValue() < 0){
            return true;
        }
        return false;
    }

    /**
     * a function to tell you if a Number is positive
     * @param i
     * @return
     */
    public static boolean isPositive(Number i){
        if(i.doubleValue() < 0){
            return false;
        }
        return true;
    }
//----------------------------------------------------------------------------------------------------------------------

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 10000s place
     */
    public static double rnd_10000(Number a){
        return (Math.round(a.doubleValue()/10000))*10000.0;
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 1000s place
     */
    public static double rnd_1000(Number a){
        return (Math.round(a.doubleValue()/1000))*1000.0;
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 100s place
     */
    public static double rnd_100(Number a){
        return (Math.round(a.doubleValue()/100))*100.0;
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 10s place
     */
    public static double rnd_10(Number a){
        return (Math.round(a.doubleValue()/10))*10.0;
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 1s place
     */
    public static double rnd_1(Number a){
        return (Math.round(a.doubleValue()));
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 1/10ths place
     */
    public static double rnd_10th(Number a){
        return (Math.round(a.doubleValue()*10))/10.0;
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 1/100ths place
     */
    public static double rnd_100th(Number a){
        return (Math.round(a.doubleValue()*100))/100.0;
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 1/1000ths place
     */
    public static double rnd_1000th(Number a){
        return (Math.round(a.doubleValue()*1000))/1000.0;
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 1/10000ths place
     */
    public static double rnd_10000th(Number a){
        return (Math.round(a.doubleValue()*10000))/10000.0;
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 1/100000ths place
     */
    public static double rnd_100000th(Number a){
        return (Math.round(a.doubleValue()*100000))/100000.0;
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 1/1000000ths place
     */
    public static double rnd_1000000th(Number a){
        return (Math.round(a.doubleValue()*1000000))/1000000.0;
    }

    /**
     *
     * @param a java.lang.Number
     * @return double -- a rounded to the 1/10000000ths place
     */
    public static double rnd_10000000th(Number a){
        return (Math.round(a.doubleValue()*10000000))/10000000.0;
    }

//----------------------------------------------------------------------------------------------------------------------

    /**
     * a simplified call to java.lang.Math.abs(a)
     * @param a
     * @return
     */
    public static Number abs(Number a){
        return Math.abs(a.doubleValue());
    }
    /**
     * a simplified call to java.lang.Math.min(a, b)
     * @param a
     * @param b
     * @return
     */
    public static Number min(Number a, Number b){
        return Math.min(a.doubleValue(), b.doubleValue());
    }
    /**
     * a simplified call to java.lang.Math.max(a, b)
     * @param a
     * @param b
     * @return
     */
    public static Number max(Number a, Number b){
        return Math.max(a.doubleValue(), b.doubleValue());
    }
//----------------------------------------------------------------------------------------------------------------------

    /**
     * a function to convert a Set to an ArrayList
     * @param a
     * @return
     */
    public static ArrayList<Object> set2arrayList(Set<Object> a){
        return new ArrayList<>(a);
    }
    /**
     * a function to convert an ArrayList to a Set
     * @param a
     * @return
     */
    public static Set<Object> arrayList2set(ArrayList<Object> a){
        return Set.of(a);
    }
    /**
     * a function to convert an ArrayList to an array
     * @param a
     * @return
     */
    public static Object[] arrayList2array(ArrayList<Object> a){
        return a.toArray();
    }
    /**
     * a function to convert a Set to an array
     * @param a
     * @return
     */
    public static Object[] set2array(Set<Object> a){
        return a.toArray();
    }
    /**
     * a function to create a Set
     * @param args
     * @return
     */
    public static Set<Object> mkSet(Object ... args){
        return Set.of(args);
    }
    /**
     * a function to create an ArrayList
     * @param args
     * @return
     */
    public static ArrayList<Object> mkArrayList(Object ... args){
        return new ArrayList<Object>(Arrays.asList(args));
    }
    /**
     * a function to create a List
     * @param args
     * @return
     */
    public static List<Object> mkList(Object ... args){
        return Arrays.asList(args);
    }
    /**
     * a function to create an array
     * @param args
     * @return
     */
    public static Object[] mkArray(Object ... args){
        return args;
    }
//----------------------------------------------------------------------------------------------------------------------

    /**
     * a function to combine Strings
     * @param args
     * @return
     */
    public static String strCombiner(String ... args){
        StringBuilder temp = new StringBuilder();
        for(String i : args){
            temp.append(i);
        }
        return temp.toString();
    }
//----------------------------------------------------------------------------------------------------------------------

    /**
     * a function to print information about different datatypes
     */
    public static void printData(){
        StringBuilder sb = new StringBuilder();
        sb.append("a variable of type \'short\' or type \'java.lang.Short\' can store a value between "+shortUpperLimit+" and "+shortLowerLimit+"\n");
        sb.append("a variable of type \'int\' or type \'java.lang.Integer\' can store a value between "+intUpperLimit+" and "+intLowerLimit+"\n");
        sb.append("a variable of type \'long\' or type \'java.lang.Long\' can store a value between "+longUpperLimit+" and "+longLowerLimit+"\n");
        sb.append("a variable of type \'byte\' or type \'java.lang.Byte\' can store a value between "+byteUpperLimit+" and "+byteLowerLimit+"\n");
        sb.append("a variable of type \'float\' or type \'java.lang.Float\' can store up to a 7 decimal digit value between "+floatUpperLimit+" and "+floatLowerLimit+"\n");
        sb.append("a variable of type \'double\' or type \'java.lang.Double\' can store up to a 15 decimal digit value between "+doubleUpperLimit+" and "+doubleLowerLimit+"\n");

        pln(sb);
    }
}
