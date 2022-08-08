package Lesson3;

public class Lesson3 {


    public static void main(String [] args) {

        int i1 = 5;
        int i2 =11;
        double d1=5.5;
        double d2=1.3;
        long l = 20L;
        double result =0;
        result = i2/d1+d2%i1-l;

        System.out.println(result);
        int a=5, b=8;
        int c = a-- - --a + ++a + a++ + a;
        //4-3+4+4=10+5=15
        //int f = ++b - b++ + ++b - --b;
        int f2 =  ++b - b++;
        //9 - 9+1=1  10-9=2
        System.out.println(c);
        System.out.println(f2);
    }
}

