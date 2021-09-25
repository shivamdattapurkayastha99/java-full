
interface Bicycle{
    int a=45;

    void applyBrake(int decrement);
     void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("pee pee");

    }
    public void applyBrake(int decrement){
        System.out.println("apply brake");

    }
    public void speedUp(int increment){
        System.out.println("speed up");
    }

}
public class x23 {
    public static void main(String[] args) {
        AvonCycle shivamcycle=new AvonCycle();
        shivamcycle.applyBrake(1);
        System.out.println(shivamcycle.a);

    }
}