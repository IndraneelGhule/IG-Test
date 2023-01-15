package Programs;

import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {

        System.out.println("Enter the no: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        for(int j=1;j<=no;j++){
            getPrime(j);
        }

    }


    public static boolean getPrime(int no){

        boolean flag = false;

        if (no == 0 || no == 1) {
            //System.out.println("No Prime: " + no);
        }
        else if(no == 2){
            System.out.println("Prime: " + no);
        }
        else {
            for (int j = 2; j < no; j++) {

                if (no % j == 0) {
                    //System.out.println("No Prime: " + no);
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("Prime: " + no);
        }
        return flag;
    }
}
