package Patterns;

import java.util.Scanner;

public class RightAngleTriangle {

    public static void main(String[] args){

        SandGlassStar(3);
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        boolean flag = true;

        while(flag) {
            System.out.println("1. Left Hand Triangle\n2. Right Angle Triangle\n3.Middle Triangle\n4. SandGlassStar");
            int no1 = sc.nextInt();

            switch (no1) {
                case 1:
                    LeftTriangle(no);
                    break;
                case 2:
                    RightTriangle(no);
                    break;
                case 3:
                    MiddleTriangle(no);
                    break;
                case 4:
                    SandGlassStar(no);
                    break;
            }
        }
    }

    public static void LeftTriangle(int a){
        for(int i=1;i<=a;i++){

            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<a-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void RightTriangle(int a){

        for(int i=1;i<=a;i++){
            for(int j=0;j<a-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void MiddleTriangle(int a){

        int counter1 = a-1;
        int counter2 = 1;

        for(int i=1;i<=a;i++){
            for(int j=0;j<counter1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<counter2;j++){
                System.out.print("*");
            }
            for(int j=0;j<counter1;j++){
                System.out.print(" ");
            }
            System.out.println();
            counter2 = counter2 +2;
            counter1--;
        }
    }

    public static void SandGlassStar(int a){

        int counter1 = 0;
        int counter2 = a*2-1;

        for(int i=1;i<=a;i++){
            for(int j=0;j<counter1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<counter2;j++){
                System.out.print("*");
            }
            for(int j=0;j<counter1;j++){
                System.out.print(" ");
            }
            System.out.println();
            counter2 = counter2 -2;
            counter1++;
        }
        MiddleTriangle(a);

    }


}
