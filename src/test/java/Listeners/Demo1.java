package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Demo1 {


    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDRANEEL GHULE\\Desktop\\Interview\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        WebDriverListenerAllMethods all = new WebDriverListenerAllMethods();
        eventFiringWebDriver.register(all);

        eventFiringWebDriver.get("https://www.google.com/search?q=english+to+marathi&oq=english+to+marathi&aqs=chrome..69i57j0l5.7276j0j7&sourceid=chrome&ie=UTF-8");
        eventFiringWebDriver.navigate().to("https://www.google.com/search?q=english+to+marathi&oq=english+to+marathi&aqs=chrome..69i57j0l5.7276j0j7&sourceid=chrome&ie=UTF-8");

        eventFiringWebDriver.quit();



    }


}
