package Programs;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        System.out.println("Enter the No: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int ans=1;

        for(int i=no; i>0;i--){
            ans = ans * i;
        }
        System.out.println(ans);
    }



}
