package page;

import org.openqa.selenium.WebDriver;

public class WomenCategoryPage extends BasePage {

    private static final String URL = "/index.php?id_category=3&controller=category";

    public WomenCategoryPage(WebDriver driver){
        super(driver);
    }

    public String getURL() {
        return URL;
    }


}
