package pages;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseSetup;

import java.util.Properties;

public class BuyPage extends BaseSetup {
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
       searchRadiusDropDown.selectByValue(p.get("searchradius").toString());

       WebElement minPrice =  d.findElement(By.xpath("select[@id='minPrice']"));
       Select minPriceDropDown =new Select(minPrice);
       minPriceDropDown.selectByValue(p.get("minbuyprice").toString());

       WebElement maxPrice =  d.findElement(By.xpath("//select[@id='maxPrice']"));
       Select maxPriceDropDown =new Select(maxPrice);
       maxPriceDropDown.selectByValue(p.get("maxbuyprice").toString());

       WebElement minBeds =  d.findElement(By.xpath("//select[@id='minBedrooms']"));
       Select minBedsDropDown =new Select(minBeds);
       minBedsDropDown.selectByValue(p.get("minbed").toString());

       WebElement maxBeds =  d.findElement(By.xpath("//select[@id='maxBedrooms']"));
       Select maxBedsDropDown =new Select(maxBeds);
       maxBedsDropDown.selectByValue(p.get("maxbed").toString());

       WebElement propType =  d.findElement(By.xpath("//select[@id='displayPropertyType']"));
       Select propTypeDropdown =new Select(propType);
       propTypeDropdown.selectByValue(p.get("proptype").toString());

       WebElement maxDays =  d.findElement(By.xpath("//select[@id='maxDaysSinceAdded']"));
       Select maxDaysDropdown =new Select(maxDays);
       maxDaysDropdown.selectByValue(p.get("maxdays").toString());

       d.findElement(By.xpath("//button[@id='submit']")).click();

}

}
