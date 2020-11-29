package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SignInPage extends BasePage{

    private static final String URL = "/index.php?controller=authentication&back=my-account";
    private static final By createAccountEmailTB = By.id("email_create");
    private static final By emailTB = By.id("email");
    private static final By passwordTB = By.id("passwd");
    private static final By loginBTN = By.id("SubmitLogin");
    private static final By createAccountBTN = By.id("SubmitCreate");

    public SignInPage(WebDriver driver)
    {
        super(driver);
    }

    public String getURL() {
        return URL;
    }


    public void fillLoginEmailTB(String emailId){
        this.waitForPageLoaded();
        driver.findElement(emailTB).sendKeys(emailId);
    }

    public void fillPasswordTB(String password){
        this.waitForPageLoaded();
        driver.findElement(passwordTB).sendKeys(password);
    }

    public void clickLoginBTN(){
        this.waitForPageLoaded();
        driver.findElement(loginBTN).click();
    }





}
