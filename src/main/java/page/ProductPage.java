package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ProductPage extends BasePage{

    private static final String URL = "/index.php?id_product=1&controller=product";
    private static final By itemSizeMenu = By.id("group_1");
    private static final By itemColour = By.id("color_14");
    private static final By addToCartButton = By.name("Submit");
    private static final By proceedToCheckoutButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");

    public ProductPage(WebDriver driver){
        super(driver);
    }

    public String getURL() {
        return URL;
    }

    public void selectItemSize(){
        this.waitForPageLoaded();
        Select sizeMenu = new Select(driver.findElement(itemSizeMenu));
        sizeMenu.selectByVisibleText("M");
    }

    public void selectItemColour(){
        this.waitForPageLoaded();
        if(this.isElementVisible(itemColour)) {
            driver.findElement(itemColour).click();
        }else{
            System.out.println("Element not found! ::" + itemColour.toString());
        }
    }

    public void clickAddtoCartButton(){

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        if(this.isElementVisible(addToCartButton))
        {
            driver.findElement(addToCartButton).click();
        }else{
            System.out.println("Element not found! ::" + addToCartButton.toString());
        }
    }

    public void clickProceedToCheckoutButton(){
        this.waitForPageLoaded();
        if(this.isElementVisible(proceedToCheckoutButton))
        {
            driver.findElement(proceedToCheckoutButton).click();
        }else{
            System.out.println("Element not found! ::" + proceedToCheckoutButton.toString());
        }
    }
}
