import java.util.Scanner;
public class x19 {

    /*static*/ int logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;

        }
        else {
            z=(x+y)*5;

        }
        return z;

    }
    public static void main(String[] args) {
//        int a=5;
//        int b=7;
//        int c;
//        if (a>b){
//            c=a+b;
//
//        }
//        else {
//            c=(a+b)*5;
//
//        }
//        int a1=2;
//        int b1=1;
//        int c1;
//        if (a1>b1){
//            c1=a1+b1;
//
//        }
//        else {
//            c1=(a1+b1)*5;
//
//        }
//        System.out.println(c);
//        System.out.println(c1);
        int x,y,z;

        Scanner sc=new Scanner(System.in);
        x19 ob=new x19();

        System.out.println("Enter first no");
        x=sc.nextInt();
        System.out.println("Enter second no");
        y=sc.nextInt();
//        z=logic(x,y);
        z=ob.logic(x,y);

        System.out.println("The result is "+z);

    }
}