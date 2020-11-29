package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartSummaryPage extends BasePage{

    private static final String URL = "/index.php?controller=order";
    private static final By proceedToCheckoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");

    public CartSummaryPage(WebDriver driver){
        super(driver);
    }

    public void clickProceedToCheckOutButton()
    {
        this.waitForPageLoaded();
        if(this.isElementVisible(proceedToCheckoutButton)){
            driver.findElement(proceedToCheckoutButton).click();
        }else{
            System.out.println("Element not found ::" + proceedToCheckoutButton.toString());
        }
    }


}