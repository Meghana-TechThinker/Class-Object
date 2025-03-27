class P5 {
    void display(){
        System.out.println("Display from p1");
    }
}
class MethOverride extends P5{
    void display(){
        System.out.println("Display from child");
    }
    public static void main(String[] args) {
        MethOverride m=new MethOverride();
        m.display();
    }
}
