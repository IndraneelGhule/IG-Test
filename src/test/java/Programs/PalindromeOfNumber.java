package Programs;

import java.util.Scanner;

public class PalindromeOfNumber {

    public static void main(String[] args) {

        System.out.println("Enter String Number");
        Scanner sc = new Scanner(System.in);
        PalindromeNumber();
    }

    public static void PalindromeNumber(){
        Scanner sc = new Scanner(System.in);
        String no = "" + sc.next();

        String number = no;
        String temp="";

        for(int i=number.length()-1;i>=0;i--){

            temp = temp + number.charAt(i);
        }
        System.out.println("Palindrome: "+temp);
    }

}
