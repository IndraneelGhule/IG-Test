package RetryExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {


    @Test(retryAnalyzer = RetryExecution.RetryCountClass.class)
    public void M1(){
        Assert.assertTrue(2>3, "Failed M1()");

    }


}
