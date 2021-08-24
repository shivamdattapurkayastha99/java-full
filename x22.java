import java.util.Scanner;
public class x22 {
    static int fact(int n ){
        if(n<=1)
            return n;
        else {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("the factorial is "+fact(n));


    }
}