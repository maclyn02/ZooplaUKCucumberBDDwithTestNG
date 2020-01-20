package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PropertySearchResultPage extends BasePage {

    @FindBy(css = ".search-refine-location-text")
    WebElement currentLocationTextBox;

    @FindBy(css = ".listing-results")
    WebElement listResults;

    public String getCurrentLocation(){
        return currentLocationTextBox.getText();
    }
    public void printPrices(){
        List<WebElement> list = listResults.findElements(By.tagName("li"));
        int count=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getAttribute("id").startsWith("listing_")){
                WebElement listPrice = list.get(i).findElement(By.cssSelector(".listing-results-price"));
                String price = listPrice.getText();
                System.out.println(price.replaceAll("[a-zA-Z]",""));
                count++;
            }
        }
        System.out.println(count+" results found!");
    }
    public void clickNthResult(int n){
        List<WebElement> list = listResults.findElements(By.tagName("li"));
        int count=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getAttribute("id").startsWith("listing_")){
                WebElement listPrice = list.get(i).findElement(By.cssSelector(".listing-results-price"));
                count++;
                if(count==n){
                    listPrice.click();
                    break;
                }
            }
        }
    }
}
