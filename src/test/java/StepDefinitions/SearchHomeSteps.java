package StepDefinitions;

import Pages.AgentDetailsPage;
import Pages.HomePage;
import Pages.ListingPage;
import Pages.PropertySearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SearchHomeSteps {

    public HomePage home = new HomePage();
    public PropertySearchResultPage propSearchResults = new PropertySearchResultPage();
    public ListingPage listPage = new ListingPage();
    public AgentDetailsPage agentPage = new AgentDetailsPage();
    public String location=null;
    public String agentName=null;

    @Given("^User is on homepage$")
    public void user_is_on_homepage()  {
        Assert.assertEquals(home.getCurrentUrl(),"https://www.zoopla.co.uk/");

    }
    @When("^User Enters location as \"([^\"]*)\"$")
    public void user_enters_location_as_something(String loc) {
        location=loc;
        home.enterSearchLoaction(loc);
    }
    @And("^Clicks Search button$")
    public void clicks_search_button()  {
        home.clickSearchBtn();
    }

    @Then("^Print prices of results in console$")
    public void print_prices_of_results_in_console()  {
        Assert.assertTrue(propSearchResults.getTitle().contains(location));
        propSearchResults.printPrices();
    }

    @When("^user clicks 5th result$")
    public void user_clicks_5th_result() {
        propSearchResults.clickNthResult(5);
    }

    @Then("^user redirected to result page$")
    public void user_redirected_to_result_page()  {

    }

    @When("^user clicks agency link$")
    public void user_clicks_agency_link() throws InterruptedException {
        Thread.sleep(300);
        agentName = listPage.getAgentName();
        listPage.clickAgent();
    }


    @Then("^user redirected to agency page$")
    public void user_redirected_to_agency_page() throws InterruptedException {
        Thread.sleep(300);
    }

    @And("^verify agency name printed$")
    public void verify_agency_name_printed() {
        Assert.assertTrue(agentPage.verifyAgentName(agentName));
    }

}
