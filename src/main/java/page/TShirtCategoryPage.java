package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TShirtCategoryPage extends BasePage {

    private static final String URL = "/index.php?id_category=5&controller=category";
    private static final By firstItem = By.xpath("//*[@id='center_column']/ul/li/div/div/div/a/img");
    private static final By moreLink = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span");
    public TShirtCategoryPage(WebDriver driver)
    {
        super(driver);
    }

    public String getURL() {
        return URL;
    }

    public void viewFirstItem()
    {
        this.waitForPageLoaded();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        if(this.isElementVisible(moreLink))
        {
            driver.findElement(moreLink).click();
        }else{
            System.out.println("Element not found!");
        }
    }

    public void mouseOverFirstItem() {
        this.waitForPageLoaded();
        if (this.isElementVisible(firstItem)) {
            Actions actions = new Actions(driver);
            WebElement target = driver.findElement(firstItem);
            actions.moveToElement(target).perform();
        } else {
            System.out.println("Element not found!");
        }
    }
}
