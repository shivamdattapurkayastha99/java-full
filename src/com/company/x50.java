import java.util.Scanner;

class MyException extends Exception{
    @Override 
    public String toString() {
        return "toString";

    }
    @Override
    public String getMessage() {
        return "toMessage";

    }
}
public class x50 {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();

        if (a<99) {
            try {
                // throw new MyException();
                throw new ArithmeticException("this is an exception");

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();


            }
        }

    }
    
}
