class P5 {
    int a=10;
    void display(){
        System.out.println("Display from p5");
    }
}
class Super1  extends P5{
    int a=25;
    void display(){
        super.display();
        System.out.println("Display from child"+super.a);
    }
    public static void main(String[] args) {
        Super1  m1=new Super1 ();
        m1.display();
    }
}