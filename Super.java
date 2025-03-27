class P5 {
    int a=10;
    void display(){
        System.out.println("Display from p5");
    }
}
class Super  extends P5{
    int a=25;
    void display(){
        System.out.println("Display from child"+super.a);
    }
    public static void main(String[] args) {
        Super  m1=new Super ();
        m1.display();
    }
}