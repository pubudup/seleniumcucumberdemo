package step;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class BaseSteps {
    protected WebDriver driver;
    final static String BASE_URL = "http://automationpractice.com/";
    final static String driverPath = "/Users/compucorp/IdeaProjects/Demo/.idea/chromedriver";
    final static String driverName = "webdriver.chrome.driver";

    @Before
    public void before()
    {
        System.out.println("Before:init");
        System.setProperty(driverName, driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);

    }

    @After
    public void after()
    {
        System.out.println("After:teardown");
        driver.manage().deleteAllCookies();
        driver.close();

    }

    @Given("I am on homepage")
    public void i_am_on_homepage() {
        HomePage homePage = new HomePage(driver);
        assertTrue(driver.getCurrentUrl().contains(homePage.getURL()));

    }

    @When("I click on signin link")
    public void i_click_on_signin_link() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        homePage.clickSignInLink();
        assertTrue(driver.getCurrentUrl().contains(signInPage.getURL()));
    }

    @Then("I should be taken to signin page")
    public void i_should_be_taken_to_signin_page() {
        SignInPage signInPage = new SignInPage(driver);
        assertTrue(driver.getCurrentUrl().contains(signInPage.getURL()));
    }

    @When("I fill email address field with my email {string}")
    public void i_fill_email_address_field_with_my_email(String string) {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.fillLoginEmailTB(string);
    }


    @When("I fill password field with my password {string}")
    public void i_fill_password_field_with_my_password(String string) {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.fillPasswordTB(string);
    }

    @When("I click login button")
    public void i_click_login_button() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickLoginBTN();
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        assertTrue(driver.getCurrentUrl().contains(myAccountPage.getURL()));
    }

    @When("I fill search field with {string}")
    public void iFillSearchFieldWith(String searchText) {
        HomePage homePage = new HomePage(driver);
        homePage.fillSearchTextBox(searchText);
    }

    @And("I click search button")
    public void iClickSearchButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSearchButton();
    }

    @Then("a search result should be displayed")
    public void aSearchResultShouldBeDisplayed() {
        HomePage homePage = new HomePage(driver);
        boolean searchResult = homePage.isSearchResultDisplayed();
        System.out.println("Results displayed? ::: "+ searchResult);
        assertTrue(searchResult);
    }

    @When("I click Women menu link")
    public void iClickWomenMenuLink() {
        HomePage homePage = new HomePage(driver);
        homePage.clickWomenLink();
    }

    @Then("I should be taken to Women category")
    public void iShouldBeTakenToWomenCategory() {
        WomenCategoryPage womenCategoryPage = new WomenCategoryPage(driver);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL ::: "+ currentURL);
        assertTrue(currentURL.contains(womenCategoryPage.getURL()));
    }

    @When("I click on three days sale image")
    public void iClickOnThreeDaysSaleImage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickThreeDayImage();
    }

    @Then("I should be taken to external site")
    public void iShouldBeTakenToExternalSite() {
        HomePage homePage = new HomePage(driver);
        assertTrue(driver.getCurrentUrl().contains(homePage.getThreeDaysImageLink()));
    }

    @When("I click on T shirts menu link")
    public void iClickOnTShirtsMenuLink() {
        HomePage homePage = new HomePage(driver);
        homePage.clickTShirtsLink();

        TShirtCategoryPage tShirtCategoryPage = new TShirtCategoryPage(driver);
        assertTrue(driver.getCurrentUrl().contains(tShirtCategoryPage.getURL()));
    }

    @And("I click on first item")
    public void iClickOnFirstItem() {
        TShirtCategoryPage tShirtCategoryPage = new TShirtCategoryPage(driver);
        tShirtCategoryPage.mouseOverFirstItem();
        tShirtCategoryPage.viewFirstItem();

    }

    @And("I select item size")
    public void iSelectItemSize() {
        ProductPage productPage = new ProductPage(driver);
        productPage.selectItemSize();
    }

    @And("I select item colour")
    public void iSelectItemColour() {
        ProductPage productPage = new ProductPage(driver);
        productPage.selectItemColour();
    }

    @And("I click on Add to Cart Button")
    public void iClickOnAddToCartButton() {
        ProductPage productPage = new ProductPage(driver);
        productPage.clickAddtoCartButton();
    }

    @And("I click on Proceed to Checkout button from popup")
    public void iClickOnProceedToCheckoutButtonFromPopup() {
        ProductPage productPage = new ProductPage(driver);
        productPage.clickProceedToCheckoutButton();
    }


    @And("I click on Proceed to Checkout button on Cart Summary Page")
    public void iClickOnProceedToCheckoutButtonOnCartSummaryPage() {
        CartSummaryPage cartSummaryPage = new CartSummaryPage(driver);
        cartSummaryPage.clickProceedToCheckOutButton();
    }

    @And("I fill text area with {string}")
    public void iFillTextAreaWith(String message) {
        CartAddressPage cartAddressPage = new CartAddressPage(driver);
        cartAddressPage.fillCommentTextArea(message);
    }

    @And("I click on Proceed to Checkout button on Cart Address Page")
    public void iClickOnProceedToCheckoutButtonOnCartAddressPage() {
        CartAddressPage cartAddressPage = new CartAddressPage(driver);
        cartAddressPage.clickProceedToCheckOutButton();
    }

    @And("I am logged in")
    public void iAmLoggedIn() {

        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        homePage.clickSignInLink();
        assertTrue(driver.getCurrentUrl().contains(signInPage.getURL()));
        signInPage.fillLoginEmailTB("pubz87+1@gmail.com");
        signInPage.fillPasswordTB("pubz87");
        signInPage.clickLoginBTN();
        driver.get(BASE_URL);

    }

    @And("I select Terms and service checkbox")
    public void iSelectTermsAndServiceCheckbox() {

        CartShippingPage cartShippingPage = new CartShippingPage(driver);
        cartShippingPage.selectTermsCheckBox();

    }

    @And("I click on Proceed to Checkout button on step on Shipping Page")
    public void iClickOnProceedToCheckoutButtonOnStepOnShippingPage() {
        CartShippingPage cartShippingPage = new CartShippingPage(driver);
        cartShippingPage.clickProceedToCheckOutButton();
    }

    @And("I click Bank Wire option")
    public void iClickBankWireOption() {
        CartPaymentPage cartPaymentPage = new CartPaymentPage(driver);
        cartPaymentPage.clickPaymentWireLink();
    }

    @And("I click order confirmation button")
    public void iClickOrderConfirmationButton() {
        CartConfirmationPage cartConfirmationPage = new CartConfirmationPage(driver);
        cartConfirmationPage.clickConfirmButton();
    }

    @Then("I should be taken to Order confirmation page")
    public void iShouldBeTakenToOrderConfirmationPage() {
        String currentURL = driver.getCurrentUrl();
        System.out.println("Order confirmation URL is::: "+currentURL);
        assertTrue(currentURL.contains("order-confirmation"));
        assertTrue(currentURL.contains("id_cart="));
        assertTrue(currentURL.contains("id_module="));
        assertTrue(currentURL.contains("id_order="));
        assertTrue(currentURL.contains("key="));
    }

    @And("I should see order confirmation text")
    public void iShouldSeeOrderConfirmationText() {
        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
        String confirmationMessage = orderConfirmationPage.getConfirmationMessageText();
        System.out.println("Confirmation message is :::" + confirmationMessage);
        assertTrue(confirmationMessage.contains("Your order on My Store is complete."));
    }
}
