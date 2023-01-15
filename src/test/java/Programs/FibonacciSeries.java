package Programs;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

    int a = 0;
    int b = 1;
    int ans;

    System.out.println("Enter the count: ");
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    int no1 =0, no2=1, no3=0;

    System.out.print(" "+no1);
    System.out.print(" "+no2);


        for(int i=0;i<no-2;i++) {
            no3 = no2 + no1;
            System.out.print(" "+no3);
            no1 = no2;
            no2 = no3;
        }
    }
}
