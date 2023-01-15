package ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportsDemo {

    ExtentReports reports;
    ExtentTest test;
    WebDriver driver = null;
    String currentDirPath = System.getProperty("user.dir");
    long currentTime = System.currentTimeMillis();
    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void initialize(){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-YYYY HH:MM:ss");
        String da = df.format(date);

        String filePath =  currentDirPath + "\\Reports\\IG-"+System.currentTimeMillis()+"-ReportIG.html";
        reports = new ExtentReports(filePath, true);
        test = reports.startTest("Launch Chrome");

        System.setProperty("webdriver.chrome.driver", currentDirPath + "\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void M1() throws IOException {
        driver.get("https://www.google.com/");
        softAssert.assertTrue(driver.getCurrentUrl().equals("https://www.google.com/"));
        test.log(LogStatus.FAIL, "User navigated to the 'Google'");
        //softAssert.assertFalse(driver.getCurrentUrl().equals("https://www.google.com/"));

        String  screenshotPath = getScreenShotPath();
        test.log(LogStatus.FAIL,test.addScreenCapture(screenshotPath), "User navigated to the 'Google'");


        Character ch = new Character('h');

        char c1 = Character.valueOf(ch);




        System.out.println("HI");
    }

    @AfterTest
    public void close(){

        softAssert.assertAll();
        reports.endTest(test);
        reports.flush();
        driver.quit();
    }


    public String getScreenShotPath() throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir")+"\\Sceenshots\\"+currentTime+".jpg");
        FileUtils.copyFile(src,dest);
        return  dest.getAbsolutePath();
    }


}
