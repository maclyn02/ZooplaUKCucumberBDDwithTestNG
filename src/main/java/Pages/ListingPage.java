package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListingPage extends BasePage {

    @FindBy(css = ".ui-agent__details")
    WebElement agentDetails;

    @FindBy(css = ".ui-agent__name")
    WebElement agentName;

    public void clickAgent(){
        agentDetails.click();
    }
    public String getAgentName(){
        return agentName.getText();
    }
}
