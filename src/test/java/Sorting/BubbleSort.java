package Sorting;

import java.util.Scanner;

public class BubbleSort {


    public static void main(String[] args) {

    System.out.println("Enter the count of numbers: ");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    System.out.println("Enter numbers: ");
    int[] arr = new int[size];

    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }

    int temp;
    for(int i=1;i<size;i++){

        for(int j=i;j>0;j--){

            if(arr[j-1]>arr[j]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }

        System.out.println("After Sort: ");
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();


    }





}
