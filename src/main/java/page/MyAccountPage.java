package page;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{
    private static final String URL = "/index.php?controller=my-account";

    public MyAccountPage(WebDriver driver)
    {
        super(driver);
    }

    public String getURL() {
        return URL;
    }
}
