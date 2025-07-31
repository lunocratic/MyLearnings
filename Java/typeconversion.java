public class typeconversion {

    public static void main(String[] args) {
       
/*  🔹 Types of Primitive Conversions
    🔹Java supports two types:

    🔹Conversion Type         🔹Description
      (1)Widening (implicit)             Small type → bigger type (safe)
      (2)Narrowing (Explicit)           Bigger type → smaller type (may lose data)
      

*/
     
//  hierarchy:  byte → short → int → long → float → double → char 

// (1)Widening or Implicit (Small -- Big) - AutoDone By java or W

byte be = 1;
short st = be;
int it = st;
long lg = it ;
float ft = lg;
double de = ft;
/* 🚫 char c = d; */   

                /* 	char is an unsigned 16-bit type that holds characters (Unicode).
	                • double is a 64-bit floating-point number.
	                • Java does not allow automatic or even implicit narrowing from double to char.
                 */


//(2) Narrowing or Explicite

// Narrowing is not automatic — you must use casting, and data might be lost.

/*  What is Type Casting: 
    Type casting means converting one data type into another manually.
    It’s used when automatic conversion isn’t allowed (especially with narrowing conversions).
*/

// 🔹 targetType variableName = (targetType) originalValue;  (syntax)

// hierarchy: double → float → long → int → short → byte → char

double doo = 123;
float fl = (float) doo;
long lo = (long)fl;
int in = (int) lo ;
short sh = (short) in ;
byte by = (byte) sh;
char ch = (char) by;

/*
 Step-by-step Type Casting Table:

| Step | From       → To      | Type                          | Cast Needed? | Possible Data Loss                     |
|------|----------------------|-------------------------------|--------------|----------------------------------------|
| 1    | double     → float   | Floating point → Floating pt  | ✅ Yes       | Small precision loss (rounding)        |
| 2    | float      → long    | Floating point → Integer      | ✅ Yes       | Decimal part truncated                 |
| 3    | long       → int     | Integer → Smaller integer     | ✅ Yes       | If value > int range                   |
| 4    | int        → short   | Integer → Smaller integer     | ✅ Yes       | If value > short range                 |
| 5    | short      → byte    | Integer → Smaller integer     | ✅ Yes       | If value > byte range                  |
| 6    | byte       → char    | Signed → Unsigned (16-bit)    | ✅ Yes       | May show unexpected Unicode character  |
*/


/*

✔️ = Allowed
❌ = Not Allowed

| From \ To | byte | short | char | int | long | float | double | boolean |
|-----------|------|-------|------|-----|------|--------|--------|---------|
| byte      |  ✔️   |  ✔️    |  ❌   | ✔️  | ✔️   | ✔️     | ✔️     |   ❌     |
| short     |  ❌   |  ✔️    |  ❌   | ✔️  | ✔️   | ✔️     | ✔️     |   ❌     |
| char      |  ❌   |  ❌    |  ✔️   | ✔️  | ✔️   | ✔️     | ✔️     |   ❌     |
| int       |  ❌   |  ❌    |  ✔️*  | ✔️  | ✔️   | ✔️     | ✔️     |   ❌     |
| long      |  ❌   |  ❌    |  ❌   | ❌  | ✔️   | ✔️     | ✔️     |   ❌     |
| float     |  ❌   |  ❌    |  ❌   | ❌  | ❌   | ✔️     | ✔️     |   ❌     |
| double    |  ❌   |  ❌    |  ❌*  | ❌  | ❌   | ❌     | ✔️     |   ❌     |
| boolean   |  ❌   |  ❌    |  ❌   | ❌  | ❌   | ❌     | ❌     |   ✔️     |

Legend:
- ✔️ Implicit or Explicit (casting may be needed for narrowing)
- ❌ Not allowed
- * Requires explicit cast

*/







        //  primitive -->  Non primitive or wrapper Class & wrapper Class --> primitive


        //byte --> Byte
        byte b = 1 ; 
        Byte byte_obj = Byte.valueOf(b); //Boxing
        byte b2 = byte_obj.byteValue();  //Unboxing

        System.out.println(byte_obj);
        System.out.println(b2);



        //short --> Short
        short s = 12;
        Short short_obj = Short.valueOf(s); //Boxing
        short s2 = short_obj.shortValue();  //Unboxing
        
        System.out.println(short_obj);
        System.out.println(s2);



        //int --> Integer
        int a = 10;
        Integer obj = Integer.valueOf(a); //Boxing
        int a2 = obj.intValue(); //Unboxing

        System.out.println(obj);
        System.out.println(a2);



        //long --> Long
        long l = 10L;
        Long long_obj = Long.valueOf(l); //Boxing
        long l2 = long_obj.longValue(); //Unboxing

        System.out.println(long_obj);
        System.out.println(l2);



        //float --> Float
        float f = 1.23f;
        Float float_obj = Float.valueOf(f); //Boxing
        float f2 = float_obj.floatValue();  //Unboxing

        System.out.println(float_obj);
        System.out.println(f2);



        //double --> Double
        double d = 11d;
        Double double_obj = Double.valueOf(d);  //Boxing
        double d2 = double_obj.doubleValue();   //Unboxing

        System.out.println(double_obj);
        System.out.println(d2);



        //char --> Character
        char c = 'c';
        Character char_obj = Character.valueOf(c);  //Boxing
        char c2 = char_obj.charValue();             //Unboxing

        System.out.println(char_obj);
        System.out.println(c2);











        



        System.out.println(Integer.BYTES);


    }

    
}
