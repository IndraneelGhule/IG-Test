package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListeners.class)
public class Demo2 {

    @Test
    public void M1(){

        System.setProperty("webdriver.ie.driver","C:\\Users\\INDRANEEL GHULE\\Desktop\\Interview\\Drivers\\IEDriverServer.exe");
        DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        WebDriver driver = new InternetExplorerDriver();

        driver.get("https://www.google.com/search?q=english+to+marathi&oq=english+to+marathi&aqs=chrome..69i57j0l5.7276j0j7&sourceid=chrome&ie=UTF-8");

        driver.close();

    }




}
