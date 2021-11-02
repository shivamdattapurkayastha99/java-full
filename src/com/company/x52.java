public class x52{
    public static int greet(){
        try {
            int a=50;
            int b=0;
            int c=a/b;
            return c;


        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("End of function");
        }
        return -1;

    }
    public static void main(String[] args) {
        int k=greet();
        System.out.println(k);

        
        // System.out.println("End of program");
    }
}