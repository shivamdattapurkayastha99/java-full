import java.util.Scanner;

public class x49 {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        // System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();

            try {
                System.out.println("hello");
                try {
                    System.out.println(marks[ind]);
                    flag=false;
                    
                } catch (Exception e) {
                    System.out.println(e + " Level 2 exception");
                }
            } catch (Exception e) {
                System.out.println(e + " Level 1 exception");
            }
        }

    }

}
