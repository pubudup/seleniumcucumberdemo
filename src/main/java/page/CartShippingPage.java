package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartShippingPage extends BasePage{

    private static final String URL = "/index.php?controller=order";
    private static final By termsCheckBox = By.name("cgv");
    private static final By proceedToCheckoutButton = By.name("processCarrier");


    public CartShippingPage(WebDriver driver){
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

    public void selectTermsCheckBox()
    {
        this.waitForPageLoaded();
        driver.findElement(termsCheckBox).click();

    }




}