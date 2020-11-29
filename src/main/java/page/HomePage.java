package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final String URL = "http://automationpractice.com/";
    private static final By signInLink = By.linkText("Sign in");
    private static final By searchTextBox = By.id("search_query_top");
    private static final By searchButton = By.name("submit_search");
    private static final By searchResultName = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
    private static final By womenLink = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    private static final By tShirtsLink = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    private static final By threeDaysImage = By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[1]/a/img");
    private static final String threeDaysImageLink = "https://www.prestashop.com/en";




    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInLink(){
        this.waitForPageLoaded();
        driver.findElement(signInLink).click();
    }

    public static String getURL() {
        return URL;
    }

    public void fillSearchTextBox(String searchText) {
        this.waitForPageLoaded();
        if(this.isElementVisible(searchTextBox)) {
            driver.findElement(searchTextBox).sendKeys(searchText);
        } else{
            System.out.println("Element not found!");
        }
    }

    public void clickSearchButton()
    {
        this.waitForPageLoaded();
        if(this.isElementVisible(searchButton))
        {
            driver.findElement(searchButton).click();
        }else{
            System.out.println("Element not found!");
        }
    }

    public boolean isSearchResultDisplayed()
    {
        this.waitForPageLoaded();
        if(this.isElementVisible(searchResultName))
        {
            return  true;
        }else
            return false;
    }

    public void clickWomenLink()
    {
        this.waitForPageLoaded();
        if(this.isElementVisible(womenLink))
        {
            driver.findElement(womenLink).click();
        }else{
            System.out.println("Element not found!");
        }

    }

    public void clickTShirtsLink()
    {
        this.waitForPageLoaded();
        if(this.isElementVisible(tShirtsLink))
        {
            driver.findElement(tShirtsLink).click();
        }else{
            System.out.println("Element not found!");
        }

    }

    public void clickThreeDayImage()
    {
        this.waitForPageLoaded();
        if(this.isElementVisible(threeDaysImage))
        {
            driver.findElement(threeDaysImage).click();
        }else{
            System.out.println("Element not found!");
        }
    }

    public String getThreeDaysImageLink() {
        return threeDaysImageLink;
    }

}
