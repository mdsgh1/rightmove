package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

@Getter
@Setter
public class BaseSetup {

    private WebDriver webDriver = null;
    private static Properties objRepo = null;
    private static DriverManagerType browser = null;


    @Before
    @SneakyThrows
    public void init(){
        if(webDriver==null){
            Class<?> chromeClass = Class.forName(browser.browserClass());
            webDriver = (WebDriver)chromeClass.newInstance();
        }

    }
    @BeforeClass
    public static void setUpForAllTest(){

        objRepo =loadObjectRepository();
        browser = DriverManagerType.valueOf(objRepo.get("browser").toString());
        WebDriverManager.getInstance(browser).setup();
    }
    @SneakyThrows
    private static Properties loadObjectRepository(){
        objRepo = new Properties();
        objRepo.load(new FileInputStream(new File("OR.properties")));
        return objRepo;
    }

    public Properties getObjRepo(){
        return objRepo;
    }

    @After
    public void cleanup(){
    webDriver.quit();
    }
}
