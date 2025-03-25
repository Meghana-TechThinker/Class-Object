import java.util.*;
public class UseStatic {
    static int a=4;
    static int b;
    static void meth(int x){
        System.out.println("x"+x);
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
    static{
        System.out.println("static block is initialized");
        b=a*4;
        System.out.println("b :"+b);
    }
    public static void main(String[] args) {
        meth(55);
    }
}
    
