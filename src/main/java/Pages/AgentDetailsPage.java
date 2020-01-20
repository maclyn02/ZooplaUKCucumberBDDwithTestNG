package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgentDetailsPage extends BasePage{

    @FindBy(css = ".bottom-half")
    WebElement agentName;

    public Boolean verifyAgentName(String name){
        return agentName.getText().contains(name);
    }
}
