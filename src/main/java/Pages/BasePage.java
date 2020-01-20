package Pages;

import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver ;

    public BasePage(){

        driver = BrowserFactory.getDriver();
        PageFactory.initElements(driver,this);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public  String getTitle(){
        return driver.getTitle();
    }

}
