package test;


import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.SignInPage;

public class DemoTest extends BaseTest {

    @Test
    public void clickSignupLink()
    {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        homePage.clickSignInLink();
        Assert.assertTrue(driver.getCurrentUrl().contains(signInPage.getURL()));
    }

}
