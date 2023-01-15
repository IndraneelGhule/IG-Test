package Programs;

import java.util.Scanner;
/*
        *****
        P***P
        PP*PP
        PP*PP
        P***P
        *****
*/

public class Pyramid {

    public static void main(String[] args){

        System.out.println("Enter the count: ");
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();

        int counter1 = 2*row-1;
        int counter2 = 0;
        int counter3 = 2;
        int counter4 = 1;

        for(int i=0;i<row;i++){
            for(int j=0;j<counter2;j++){
                System.out.print("P");
            }
            for(int j=0;j<counter1;j++){
                System.out.print("*");
            }
            for(int j=0;j<counter2;j++){
                System.out.print("P");
            }
            counter2++;
            counter1 = counter1 -2;
            System.out.println();
        }


        for(int i=0;i<row;i++){
            for(int j=0;j<counter3;j++){
                System.out.print("P");
            }
            for(int j=0;j<counter4;j++){
                System.out.print("*");
            }
            for(int j=0;j<counter3;j++){
                System.out.print("P");
            }
            counter3--;
            counter4 = counter4 +2;
            System.out.println();
        }

    }





}
