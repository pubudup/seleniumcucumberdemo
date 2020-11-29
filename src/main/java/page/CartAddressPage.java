package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartAddressPage extends BasePage{

    private static final String URL = "/index.php?controller=order&step=1";
    private static final By proceedToCheckoutButton = By.name("processAddress");
    private static final By commentTextArea = By.name("message");

    public CartAddressPage(WebDriver driver){
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

    public void fillCommentTextArea(String message){
        this.waitForPageLoaded();
        if(this.isElementVisible(commentTextArea)){
            driver.findElement(commentTextArea).sendKeys(message);
        }else{
            System.out.println("Element not found ::" + commentTextArea.toString());
        }
    }


}