package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage {


    private static final String URL = "/index.php?controller=authentication";
    private static final By error = By.xpath("//*[@id=\"center_column\"]/div[1]");

    public AuthenticationPage(WebDriver driver){
        super(driver);
    }

    public String getURL() {
        return URL;
    }
}
