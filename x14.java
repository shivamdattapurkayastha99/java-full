import java.util.*;
public class x14 {
    public static void main(String[] args) {
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array marks");
        for (int i = 0; i < 5; i++) {
            marks[i]=sc.nextInt();


        }
        System.out.println("Elements of the array are");
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);


        }
    }
}