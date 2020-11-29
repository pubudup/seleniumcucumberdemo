package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartPaymentPage extends BasePage{

    private static final String URL = "/index.php?controller=order&multi-shipping=";
    private static final By paymentWireLink = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");

    public CartPaymentPage(WebDriver driver){
        super(driver);
    }

    public void clickPaymentWireLink()
    {
        this.waitForPageLoaded();
        if(this.isElementVisible(paymentWireLink))
        {
            driver.findElement(paymentWireLink).click();
        }else{
            System.out.println("Element not found :::" + paymentWireLink.toString());
        }
    }




}