package Programs;
import java.util.Scanner;

public class AmstrongNo {

    public static void main(String[] args){

        System.out.println("Enter the no: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        double ans=0;
        int len = str.length();

        for(int i=0;i<len;i++){
            int h = Integer.parseInt(""+str.charAt(i));
            ans = ans + Math.pow(h, len);
        }
        if(Double.parseDouble(str) == ans){
            System.out.println("Amstrong: "+ans);
        }
        else{
            System.out.println("NOT Amstrong");
        }
    }
}
