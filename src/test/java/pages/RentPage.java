package pages;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseSetup;

import java.util.Properties;

public class RentPage extends BaseSetup {
    
        private WebDriver d;
        private Properties p;

        @Before
        public void setUp() {
            d = getWebDriver();
            p = getObjRepo();

        }

        public void buyPageActions(){
            WebElement searchRadius =  d.findElement(By.xpath("select[@id='radius']"));
            Select searchRadiusDropDown =new Select(searchRadius);
            searchRadiusDropDown.selectByVisibleText(p.get(searchradius));

            WebElement minPrice =  d.findElement(By.xpath("select[@id='minPrice']"));
            Select minPriceDropDown =new Select(searchRadius);
            searchRadiusDropDown.selectByVisibleText(p.get(minprice));



        }

    }
}
