import java.util.*;
public class x21 {
    static int sum(int ...arr){
        int res=0;
        for (int a:arr) {
            res+=a;

        }
        return res;
    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
    public static void main(String[] args) {
        System.out.println("varargs");
        System.out.println("the sum of 4 and 5 is "+sum(4,5));

    }
}