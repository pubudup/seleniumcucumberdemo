package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage extends BasePage{

    private static final By confirmationMessage = By.xpath("//*[@id=\"center_column\"]/div/p/strong");

    public OrderConfirmationPage(WebDriver driver){
        super(driver);
    }

    public String getConfirmationMessageText()
    {
        this.waitForPageLoaded();
        String message = driver.findElement(confirmationMessage).getText();

        return message;
    }
}
