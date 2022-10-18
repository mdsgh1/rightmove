package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HomePageStepDefs extends utils.BaseSetup {

    WebDriver d;
    HomePage hp;
    private Properties p;


    @Given("browser is open")
    public void browserIsOpen() {

            d = getWebDriver();
            p = getObjRepo();


        d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        d.manage().window().maximize();

    }

    @And("user is on homepage")
    public void userIsOnHomepage() {
        d.navigate().to(p.get("url").toString());
    }

    @And("input box is visible and editable")
    public void inputBoxIsVisibleAndEditable() {
        hp= new HomePage();
        hp.textBoxCheck();
    }

    @When("^user enters (.*)$")
    public void userEntersAddress(String address) {
        hp.enterLocationandclick(address);
    }

    @And("the address is valid in UK")
    public void theAddressIsValidInUK() {
    }

    @And("user clicks on For Sale")
    public void userClicksOnForSale() {
    }

    @Then("user is navigated to Buy page")
    public void userIsNavigatedToBuyPage() {
        String currentURL = d.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("property-for-sale"));

    }
}
