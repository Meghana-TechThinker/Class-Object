import java.util.*;
public class MergeStr{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s="abc";
        String t="pqr";
        char ch[]=s.toCharArray();
        char th[]=t.toCharArray();
        int i=0,j=0;
        String res="";
        char k[]=new char[ch.length+th.length];
        while(i<ch.length || j<th.length){
            if(i<s.length()){
                //res+=s.charAt(i);
                //i++;
                
            }
            if(j<t.length()){
                //res+=t.charAt(j);
                //j++;
                
            }

        }
        System.out.println(k);
    }
}

