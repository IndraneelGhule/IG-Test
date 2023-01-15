package RetryExecution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryCountClass implements IRetryAnalyzer {

    int MAX_COUNT = 5;
    int currentCount = 1;

/*
    RetryCountClass(){

        System.out.println("In Constructor of RetryCountClass");
    }
*/

    @Override
    public boolean retry(ITestResult iTestResult) {

        if(currentCount < MAX_COUNT){
            currentCount++;
            return true;
        }
        else {
            return false;
        }
    }
}
