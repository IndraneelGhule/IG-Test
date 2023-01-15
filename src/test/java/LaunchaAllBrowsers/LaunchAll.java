package LaunchaAllBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Scanner;

public class LaunchAll {

    @FindBy(xpath = "")
    WebElement ele1;

    static WebDriver driver = null;

    LaunchAll() {

        PageFactory.initElements(driver, this);
    }


    @Test(groups = "")
    public static void main(String[] args){

        System.out.println("Enter the preference: ");
        System.out.println("1. Chrome\n2. IE 11\n3. Firefox");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        switch (no){
            case 1:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDRANEEL GHULE\\Desktop\\Interview\\Drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case 2:
                System.setProperty("webdriver.ie.driver", "C:\\Users\\INDRANEEL GHULE\\Desktop\\Interview\\Drivers\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case 3:
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\INDRANEEL GHULE\\Desktop\\Interview\\Drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
        }

        driver.get("https://www.google.com/search?q=english+to+marathi&oq=english+to+marathi&aqs=chrome..69i57j0l5.7276j0j7&sourceid=chrome&ie=UTF-8");


        driver.close();
    }





}
