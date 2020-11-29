/*
Download chrome driver from https://chromedriver.chromium.org/downloads
Update [DriverPath] with file location
 */
package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    protected WebDriver driver;
    final static String BASE_URL = "http://automationpractice.com/";
    final static String driverPath = "{PATH}/chromedriver";
    final static String driverName = "webdriver.chrome.driver";


    @BeforeTest
    public void init(){
        System.setProperty(driverName, driverPath);
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @AfterTest
    public void teardown()
    {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
