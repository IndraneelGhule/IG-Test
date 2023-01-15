package SeleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Iterator;
import java.util.Set;

public class CloseWindow {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDRANEEL GHULE\\Desktop\\Interview\\Drivers\\chromedriver.exe");
/*      DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        System.setProperty("webdriver.ie.driver", "C:\\Users\\INDRANEEL GHULE\\Desktop\\Interview\\Drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
*/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=english+to+marathi&oq=english+to+marathi&aqs=chrome..69i57j0l5.7276j0j7&sourceid=chrome&ie=UTF-8");



        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator i = windows.iterator();

        while(i.hasNext()){

            String child = i.next().toString();
            if(!child.equals(parent)) {
                driver.switchTo().window(child);
                driver.close();
            }
        }
        driver.switchTo().window(parent);
        driver.findElement(By.cssSelector("div.a4bIc > input")).click();
        driver.findElement(By.cssSelector("div.a4bIc > input")).clear();
        driver.findElement(By.cssSelector("div.a4bIc > input")).sendKeys("IG");
        driver.quit();

    }

}
