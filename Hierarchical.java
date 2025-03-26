class P1{
    void access(){
        System.out.println("Acces-p1");
    }
}
class P2 extends P1{
    void display(){
        System.out.println("display in p2");
    }
}
class P3 extends P1{
    void method(){
        System.out.println("method-p3");
    }
}
class P4 extends P1{
    void access1(){
        System.out.println("Accessing in P4");
    }
}
public class Hierarchical {
    public static void main(String[] args){
        P2 o=new P2();
        P3 a=new P3();
        o.access();
        a.method();
    }
}
