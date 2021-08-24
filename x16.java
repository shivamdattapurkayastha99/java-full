import java.util.Scanner;
public class x16 {
    public static void main(String[] args) {
        int flats[][]=new int[2][3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j=0;j<3;j++){
                flats[i][j]=sc.nextInt();

            }

        }
        System.out.println("The flats are");
        for (int i = 0; i < 2; i++) {
            for (int j=0;j<3;j++){
                System.out.print(flats[i][j]+" ");

            }
            System.out.println();
        }
//        for (int i = 0; i < flats.length; i++) {
//            for (int j=0;j<flats[i].length;j++){
//                System.out.print(flats[i][j]+" ");
//
//            }
//            System.out.println();
//        }


    }
}