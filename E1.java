interface E2{
    int min=10;
    void add();
}
interface E3{
    void display();
}
class W1{
    void access(){
        System.out.println("magi");
    }
}
class E1 extends W1 implements E2,E3{
    public void add(){
        System.out.println("hi");
    }
    public void display(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        E1 e=new E1();
        e.add();
        e.display();
        e.access();
    }
    
}
