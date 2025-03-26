import java.util.*;
public class P1 {
    void access(){
        System.out.println("Acess in p1");
    }
}
class P2 extends P1{
    void display(){
        System.out.println("Acess in p2");
    }
}
class P3 extends P2{
    void method(){
        System.out.println("Access in p3");
    }
}
class Multilevel{
    public static void main(String[] args){
        P3 o=new P3();
        o.access();
        o.display();
        o.method();
    }
}
