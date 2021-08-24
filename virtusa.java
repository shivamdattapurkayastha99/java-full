import java.io.*;
import java.util.*;
import java.math.*;
public class virtusa {
    static  String twoStrings(String a1,String a2)
    {
        String t="";

        char a[]=a1.toCharArray();
        char b[]=a2.toCharArray();
        Set <Character> aa=new HashSet<>();
        Set <Character> bb=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            aa.add(a[i]);

        }
        for (int i = 0; i < b.length; i++) {
            bb.add(b[i]);

        }
        aa.retainAll(bb);
        if (aa.size()>0)
        {
            t="YES";

        }
        else {
            t="NO";
        }
    return  t;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String t=twoStrings(s1,s2);
        System.out.println(t);
    }
}