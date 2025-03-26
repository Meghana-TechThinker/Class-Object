/*import java.util.*;
class Parent{
    void display(){
        System.out.println("Display inheritence");
    }
}
class Single extends Parent{
    void method(){
        System.out.println("Display ");
    }
    public static void main(String[] args){
        Single s=new Single();
        s.display();
        s.method();
    }
}*/



//Using Constructor
import java.util.*;
class Parent{
    Parent(){
        System.out.println("Constructor inheritence");
    }
}
class Single extends Parent{
    void method(){
        System.out.println("Display ");
    }
    public static void main(String[] args){
        Single s=new Single();
        //s.display();
        s.method();
    }
}