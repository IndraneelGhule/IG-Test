package pkg1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculateSum {

    @Test
    @Parameters("str")
    public void M1(String str){
        System.out.println("Hi**********************8"+str);
    }


}
