import java.util.Scanner;

public class x48 {

    public static void main(String[] args) {
        int marks[]=new int [3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int x=sc.nextInt();
        System.out.println("Enter the number");
        int y=sc.nextInt();
        try {
            System.out.println("The value at array index entered is  "+marks[x]);
            System.out.println("The number used to divide is   "+marks[x]/y);
        } catch (Exception e) {
            System.out.println(e);
            
        }

    }
}