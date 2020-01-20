package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "#search-input-location")
    WebElement searchInput;

    @FindBy(css = "#search-submit")
    WebElement searchBtn;

    public void enterSearchLoaction(String location){
        searchInput.sendKeys(location);
    }
    public void clickSearchBtn(){
        searchBtn.click();
    }
}
