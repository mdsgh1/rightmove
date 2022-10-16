package pages;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseSetup;
import java.util.Properties;

public class HomePage extends BaseSetup {

    private WebDriver d;
    private Properties p;

   @Before
    public void setUp() {
        d = getWebDriver();
        p = getObjRepo();

    }

    private By txt_searchbox = By.name("typeAheadInputField");
    private By btn_forSale = By.xpath("//button[normalize-space()='For Sale']");

    public void enterLocationandclick (String address){
            d.findElement(txt_searchbox).sendKeys(address);
            d.findElement(btn_forSale).click();
        }
    }






