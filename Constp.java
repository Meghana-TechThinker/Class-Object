public class Constp {
    String name;
    int age;
    Constp(String s,int a){
        name=s;
        age=a;
        System.out.println(name+"-"+age);
    }
    public static void main(String[] args) {
        String name="magi";
        int age=123;
        Constp c1=new Constp(name,age);
    }
}
