import Utils.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    //Global hooks
    @Before
    public void start(){
        BrowserFactory.initBrowser();
    }

    @After
    public void tearDown(){
        BrowserFactory.close();
    }

    //@Before(order=num) to specify order for global hooks

    //Custom hooks
    @Before("@Search")public void printSearch(){ System.out.println("Starting Search");  }

    @After("@Search")public void endSearch(){ System.out.println("Completed Search");  }
}
