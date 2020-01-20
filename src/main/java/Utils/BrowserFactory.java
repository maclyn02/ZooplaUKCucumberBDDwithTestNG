package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    private static WebDriver driver;

    public static void initBrowser(){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver1.exe");
        driver=new ChromeDriver();
        driver.get("https://www.zoopla.co.uk/");
        System.out.println("launched");
    }

    public static void close(){
        driver.quit();
        System.out.println("closed");
        System.out.println(driver);
    }

    public static WebDriver getDriver(){
        if(driver==null)
            initBrowser();
        return driver;
    }
}
