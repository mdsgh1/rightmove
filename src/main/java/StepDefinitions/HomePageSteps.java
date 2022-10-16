package StepDefinitions;

public class HomePageSteps extends java.utils.BaseSetup.java  {
    public HomePageSteps() {
        Given("^browser is open$", () -> {
            d = getWebDriver();
            p = getObjRepo();
        });
        And("^user is on homepage$", () -> {
        });
        And("^input box is visible and editable$", () -> {
        });
        When("^user enters <address>$", () -> {
        });
        And("^the address is valid in UK$", () -> {
        });
        And("^user clicks on For Sale$", () -> {
        });
        Then("^user is navigated to Buy page$", () -> {
        });
    }
}
