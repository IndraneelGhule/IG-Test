package Programs;
/*
*****
P***P
PP*PP
*/

import java.util.Scanner;

public class InverseTriangle {
    public static void main(String[] args){

        System.out.println("Enter the no:");
        Scanner sc= new Scanner(System.in);

        int rows = sc.nextInt();
        int counter1 = 0;
        int counter2 = 2 * rows-1;


        for(int i=1;i<=rows;i++) {

            for(int j=0;j<counter1;j++){
                System.out.print("P");
            }
            for(int j=0;j<counter2;j++){
                System.out.print("*");
            }
            for(int j=0;j<counter1;j++){
                System.out.print("P");
            }
            counter2 = counter2-2;
            counter1++;
            System.out.println();
        }
    }




}
