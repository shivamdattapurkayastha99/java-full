import java.util.*;

public class x9 {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        age=sc.nextInt();

        switch (age){
            case 18:
                System.out.println("you are going to be adult");
                break;
            case 21:
                System.out.println("you are going to join a job");
                break;
            case 60:
                System.out.println("you are going to retire");
                break;
            default:
                System.out.println("enjoy your life");


        }
    }
}