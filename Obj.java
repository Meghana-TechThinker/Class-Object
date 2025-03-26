public class Obj {
    int n;
    void getdata(int a){
        n=a;
    }
    int rev(){
        int re=0;
        while(n>0){
            int r=n%10;
            re=re*10+r;
            n=n/10;
        }
        return re;
    }
    public static void main(String[] args) {
        Obj s=new Obj();
        int a=1234;
        s.getdata(a);
        int reverse=s.rev();
        System.out.println("Reverse of number:"+reverse);
     }
}
