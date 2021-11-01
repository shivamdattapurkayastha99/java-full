class NegativeRadiusException extends Exception{
    @Override 
    public String toString() {
        return "Radius cannot be negative";

    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative";

    }
}
public class x51 {
    public static int divide(int a, int b) throws ArithmeticException {
        int c = a / b;
        return c;

    }
    public static double area(int a) throws NegativeRadiusException {
        if (a<0) {
            throw  new NegativeRadiusException();
        }
        double c = Math.PI*a*a;
        return c;

    }
    public static void main(String[] args) {
        try {
            // int c = divide(6, 0);
            // System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }
}
