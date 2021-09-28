import java.util.Random;
import java.util.Scanner; 

class Game {
    public int number;
    public int inputNumber;

    public int noOfGuesses=0;
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;

    }
    Game(){
        Random rand=new Random();

        this.number=rand.nextInt(10);

    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
        // return inputNumber;

    }
    boolean isCorrectNumber(){
        noOfGuesses++;

        if (inputNumber==number) {
            System.out.println("Yes Shivam you guessed it right it was "+number+" and you guessed it in "+noOfGuesses+" attempts");
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too less ");
        }
        else{
            System.out.println("too high");
        }
        return false;
    }

}
public class x38 {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while (!b) {
            g.takeUserInput();

        b=g.isCorrectNumber();
        System.out.println(b);
        }
    }
}
