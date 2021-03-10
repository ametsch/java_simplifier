import java.nio.charset.Charset;
import java.util.*;


public class Simplifier {
    private Simplifier(){}
//----------------------------------------------------------------------------------------------------------------------
    public static final short shortUpperLimit = 32_767;
    public static final short shortLowerLimit = -32_768;

    public static final int intUpperLimit = 2_147_483_647;
    public static final int intLowerLimit = -2_147_483_648;

    public static final long longUpperLimit = 9_223_372_036_854_775_807L;
    public static final long longLowerLimit = -9_223_372_036_854_775_808L;

    public static final byte byteUpperLimit = 127;
    public static final byte byteLowerLimit = -128;

    public static final float floatUpperLimit = 3.4e+038f;
    public static final float floatLowerLimit = 3.4e-038f;

    public static final double doubleUpperLimit = 1.7e+308d;
    public static final double doubleLowerLimit = 1.7e-308d;

    public static final double pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989d;
    public static final float piFloat = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989f;

    public static final double e = 2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435729003342952605956307381323286279434907632338298807531952510190115738341879307021540891499348841675092447614606680822648001684774118537423454424371075390777449920695517027618386062613313845830007520449338265602976067371132007093287091274437470472306969772093101416928368190255151086574637721112523897844250569536967707854499699679468644549059879316368892300987931277361782154249992295763514822082698951936680331825288693984964651058209392398294887933203625094431173012381970684161403970198376793206832823764648042953118023287825098194558153017567173613320698112509961818815930416903515988885193458072738667385894228792284998920868058257492796104841984443634632449684875602336248270419786232090021609902353043699418491463140934317381436405462531520961836908887070167683964243781405927145635490613031072085103837505101157477041718986106873969655212671546889570350354d;
    public static final float eFloat = 2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435729003342952605956307381323286279434907632338298807531952510190115738341879307021540891499348841675092447614606680822648001684774118537423454424371075390777449920695517027618386062613313845830007520449338265602976067371132007093287091274437470472306969772093101416928368190255151086574637721112523897844250569536967707854499699679468644549059879316368892300987931277361782154249992295763514822082698951936680331825288693984964651058209392398294887933203625094431173012381970684161403970198376793206832823764648042953118023287825098194558153017567173613320698112509961818815930416903515988885193458072738667385894228792284998920868058257492796104841984443634632449684875602336248270419786232090021609902353043699418491463140934317381436405462531520961836908887070167683964243781405927145635490613031072085103837505101157477041718986106873969655212671546889570350354f;

    public static final double phi = 1.61803398874989484820458683436563811772030917980576286213544862270526046281890244970720720418939113748475408807538689175212663386222353693179318006076672635443338908659593958290563832266131992829026788067520876689250171169620703222104321626954862629631361443814975870122034080588795445474924618569536486444924104432077134494704956584678850987433944221254487706647809158846074998871240076521705751797883416625624940758906970400028121042762177111777805315317141011704666599146697987317613560067087480710131795236894275219484353056783002287856997829778347845878228911097625003026961561700250464338243776486102838312683303724292675263116533924731671112115881863851331620384005222165791286675294654906811317159934323597349498509040947621322298101726107059611645629909816290555208524790352406020172799747175342777592778625619432082750513121815628551222480939471234145170223735805772786160086883829523045926478780178899219902707769038953219681986151437803149974110692608867429622675756052317277752035361393621076738d;
    public static final float phiFloat = 1.61803398874989484820458683436563811772030917980576286213544862270526046281890244970720720418939113748475408807538689175212663386222353693179318006076672635443338908659593958290563832266131992829026788067520876689250171169620703222104321626954862629631361443814975870122034080588795445474924618569536486444924104432077134494704956584678850987433944221254487706647809158846074998871240076521705751797883416625624940758906970400028121042762177111777805315317141011704666599146697987317613560067087480710131795236894275219484353056783002287856997829778347845878228911097625003026961561700250464338243776486102838312683303724292675263116533924731671112115881863851331620384005222165791286675294654906811317159934323597349498509040947621322298101726107059611645629909816290555208524790352406020172799747175342777592778625619432082750513121815628551222480939471234145170223735805772786160086883829523045926478780178899219902707769038953219681986151437803149974110692608867429622675756052317277752035361393621076738f;

    public static final double sqrt2 = 1.4142135623730950488016887242096980785696718753769480731766797379907324784621070388503875343276415727350138462309122970249248360558507372126441214970999358314132226659275055927557999505011527820605714701095599716059702745345968620147285174186408891986095523292304843087143214508397626036279952514079896872533965463318088296406206152583523950547457502877599617298355752203375318570113543746034084988471603868999706990048150305440277903164542478230684929369186215805784631115966687130130156185689872372352885092648612494977154218334204285686060146824720771435854874155657069677653720226485447015858801620758474922657226002085584466521458398893944370926591800311388246468157082630100594858704003186480342194897278290641045072636881313739855256117322040245091227700226941127573627280495738108967504018369868368450725799364729060762996941380475654823728997180326802474420629269124859052181004459842150591120249441341728531478105803603371077309182869314710171111683916581726889419758716582152128229518488472089694633862891d;
    public static final float sqrt2Float = 1.4142135623730950488016887242096980785696718753769480731766797379907324784621070388503875343276415727350138462309122970249248360558507372126441214970999358314132226659275055927557999505011527820605714701095599716059702745345968620147285174186408891986095523292304843087143214508397626036279952514079896872533965463318088296406206152583523950547457502877599617298355752203375318570113543746034084988471603868999706990048150305440277903164542478230684929369186215805784631115966687130130156185689872372352885092648612494977154218334204285686060146824720771435854874155657069677653720226485447015858801620758474922657226002085584466521458398893944370926591800311388246468157082630100594858704003186480342194897278290641045072636881313739855256117322040245091227700226941127573627280495738108967504018369868368450725799364729060762996941380475654823728997180326802474420629269124859052181004459842150591120249441341728531478105803603371077309182869314710171111683916581726889419758716582152128229518488472089694633862891f;
//----------------------------------------------------------------------------------------------------------------------
    public static void p(Object a){
        System.out.print(a);
    }
    public static void p(ArrayList<Object> a){
        System.out.print(a);
    }
    public static void p(List<Object> a){
        System.out.print(a);
    }
    public static void p(Set<Object> a){
        System.out.print(a);
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void pln(Object a){
        System.out.println(a);
    }
    public static void pln(ArrayList<Object> a){
        System.out.println(a);
    }
    public static void pln(List<Object> a){
        System.out.print(a);
    }
    public static void pln(Set<Object> a){
        System.out.print(a);
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void newLine(){
        System.out.println();
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void pf(String a, Object ... args){
        System.out.printf(a, args);
    }
//----------------------------------------------------------------------------------------------------------------------
    public static boolean isEqual(Object a, Object b){
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
    public static String byteArrayList2hexString(ArrayList<Byte> a){
        StringBuilder sb = new StringBuilder();
        for(Byte i : a){
            int temp = (int) i;
            sb.append(Integer.toHexString(temp));
            sb.append(" ");
        }
        return sb.toString();
    }
    public static long int2long(int a){
        return a;
    }
    public static int short2int(short a){
        return a;
    }
    public static long short2long(short a){
        return a;
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
    public static Number abs(Number a){
        return Math.abs(a.doubleValue());
    }
    public static Number min(Number a, Number b){
        return Math.min(a.doubleValue(), b.doubleValue());
    }
    public static Number max(Number a, Number b){
        return Math.max(a.doubleValue(), b.doubleValue());
    }
//----------------------------------------------------------------------------------------------------------------------
    public static ArrayList<Object> set2arrayList(Set<Object> a){
        return new ArrayList<>(a);
    }
    public static Set<Object> arrayList2set(ArrayList<Object> a){
        return Set.of(a);
    }
    public static Object[] arrayList2array(ArrayList<Object> a){
        return a.toArray();
    }
    public static Object[] set2array(Set<Object> a){
        return a.toArray();
    }
    public static Set<Object> mkSet(Object ... args){
        return Set.of(args);
    }
    public static ArrayList<Object> mkArrayList(Object ... args){
        return new ArrayList<Object>(Arrays.asList(args));
    }
    public static List<Object> mkList(Object ... args){
        return Arrays.asList(args);
    }
    public static Object[] mkArray(Object ... args){
        return args;
    }
//----------------------------------------------------------------------------------------------------------------------
    public static String strCombiner(String ... args){
        StringBuilder temp = new StringBuilder();
        for(String i : args){
            temp.append(i);
        }
        return temp.toString();
    }
//----------------------------------------------------------------------------------------------------------------------
}
