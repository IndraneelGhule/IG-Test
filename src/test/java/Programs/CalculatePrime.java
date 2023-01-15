package Programs;

/*

****
***
**
*

*/

public class CalculatePrime {


    public static void main(String[] args) {

        int no =3;
        int counter=5;
        int counter2=0;

        for(int j=0;j<no;j++) {

            for (int k = 0; k<counter2 ; k++){
                System.out.print("P");
            }

            for (int i = 0; i<counter; i++) {
                System.out.print("*");
            }
            for (int k = 0; k<j ; k++){
                System.out.print("P");
            }
            System.out.println();

            counter2++;
            counter = counter -2 ;
        }

    }






}
