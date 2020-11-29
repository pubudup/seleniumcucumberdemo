package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartConfirmationPage extends BasePage {

    private static final String URL = "/index.php?fc=module&module=bankwire&controller=payment";
    private static final By confirmButton = By.xpath("//*[@id=\"cart_navigation\"]/button/span");

    public CartConfirmationPage(WebDriver driver){
        super(driver);
    }

    public void clickConfirmButton()
    {
        this.waitForPageLoaded();
        driver.findElement(confirmButton).click();
    }
}
